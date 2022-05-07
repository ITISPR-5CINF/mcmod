package it.pr.itis.quartacinf.quartacinfmod.register;

import it.pr.itis.quartacinf.quartacinfmod.QuartaCInfMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, QuartaCInfMod.MOD_ID);

    public static final DeferredRegister<Item> ITEMS = Items.ITEMS;

    // REGISTRATION: Init
    public static final RegistryObject<Block> NAPOLETANITE_ORE = registerBlock("napoletanite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN)));
    // REGISTRATION: End

    public static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        // Rompe tutto
        /*
        registerItem(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(TUTORIAL_TAB)));
        */
        return toReturn;
    }

    public static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                               Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        return ITEMS.register(name, item.apply(obj)); //A>AAAAAAAAAAAAAAAA
    }

    /**
     * NON USARE!
     * Registra l'event bus.
     * Questo metodo deve essere utilizzato solo dal construttore della mod.
     */
    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
