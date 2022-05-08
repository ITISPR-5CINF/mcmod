package it.pr.itis.quartacinf.quartacinfmod.register;

import java.util.function.Supplier;
import it.pr.itis.quartacinf.quartacinfmod.QuartaCInfMod;
import it.pr.itis.quartacinf.quartacinfmod.setup.Registration;
import it.pr.itis.quartacinf.quartacinfmod.util.ModTier;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class Items {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, QuartaCInfMod.MOD_ID);

    // L'icona che apppare nel menu di creativa
    public static final RegistryObject<Item> ICON_ITEM = registerItem("icon_item",
            () -> new Item(new Item.Properties()));

    // REGISTRATION: Init
    // Miscellaneous
    public static final RegistryObject<Item> DIAMOND_NUGGET = registerItem("diamond_nugget",
            () -> new Item(new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> GOD_EYE = registerItem("god_eye",
            () -> new BowItem(new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> COAL_COKE = registerItem("coal_coke",
            () -> new Item(new Item.Properties().tab(Registration.CREATIVE_TAB)) {
                @Override
                public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                    return 3200;
                }
            });

    // Napoli
    //FACCIAMO RINASCERE LA SCARRAFONE MODE #PISTOLENELLAFENDI
    public static final RegistryObject<Item> NAPOLETANITE = registerItem("napoletanite",
            () -> new Item(new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> NAPOLETANITE_WATCH = registerItem("napoletanite_watch",
            () -> new Item(new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> TARANTELLA_MUSIC_DISC = registerItem("tarantella_music_disc",
            () -> new RecordItem(4, ModSounds.TARANTELLA_NAPOLETANA,
                    new Item.Properties().tab(Registration.CREATIVE_TAB).stacksTo(1)));

    public static final RegistryObject<Item> NAPOLETANITE_PICKAXE = registerItem("napoletanite_pickaxe",
            () -> new PickaxeItem(ModTier.NAPOLETANITE_TIER, 1, 2.2f,
                    new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> NAPOLETANITE_SWORD = registerItem("napoletanite_sword",
            () -> new SwordItem(ModTier.NAPOLETANITE_TIER, 3, 1.6f,
                    new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> NAPOLETANITE_AXE = registerItem("napoletanite_axe",
            () -> new AxeItem(ModTier.NAPOLETANITE_TIER, 5, 1f,
                    new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> NAPOLETANITE_HOE = registerItem("napoletanite_hoe",
            () -> new HoeItem(ModTier.NAPOLETANITE_TIER, 0, 4f,
                    new Item.Properties().tab(Registration.CREATIVE_TAB)));

    public static final RegistryObject<Item> NAPOLETANITE_SHOVEL = registerItem("napoletanite_shovel",
            () -> new ShovelItem(ModTier.NAPOLETANITE_TIER, 0, 2.8f,
                    new Item.Properties().tab(Registration.CREATIVE_TAB)));
    // REGISTRATION: END

    /**
     * Registra un nuovo elemento
     * @param name nome dell'elemento
     * @param item oggetto Item
     * @return
     * @param <T>
     */
    public static <T extends Item> RegistryObject<T> registerItem(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    /**
     * NON USARE!
     * Registra l'event bus.
     * Questo metodo deve essere utilizzato solo dal construttore della mod.
     */
    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }


}
