package it.pr.itis.quartacinf.quartacinfmod.setup;

import java.util.function.Supplier;
import it.pr.itis.quartacinf.quartacinfmod.QuartaCInfMod;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, QuartaCInfMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, QuartaCInfMod.MOD_ID);

    // L'icona che apppare nel menu di creativa
    public static final RegistryObject<Item> ICON_ITEM = registerItem("icon_item",
            () -> new Item(new Item.Properties()));

    // La pagina che contiene tutti i nostri blocchi e oggetti custom
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(QuartaCInfMod.MOD_ID) {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(ICON_ITEM.get());
        }
    };

    /**
     * NON USARE!
     * Registra tutti i blocchi e gli oggetti.
     * Questo metodo deve essere utilizzato solo dal construttore della mod.
     */
    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
    }

    /**
     * Registra un nuovo blocco
     * @param name nome del blocco
     * @param block oggetto Block
     * @return
     * @param <T>
     */
    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    /**
     * Registra un nuovo elemento
     * @param name nome dell'elemento
     * @param item oggetto Item
     * @return
     * @param <T>
     */
    private static <T extends Item> RegistryObject<T> registerItem(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
