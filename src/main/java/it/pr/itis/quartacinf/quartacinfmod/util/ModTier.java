package it.pr.itis.quartacinf.quartacinfmod.util;

import it.pr.itis.quartacinf.quartacinfmod.register.Items;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTier {
    public static final ForgeTier NAPOLETANITE_TIER = new ForgeTier(5, 3200, 10.0f,
            0.0f, 20, BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Items.NAPOLETANITE.get()));

    public static final ForgeTier NAPOLETANITE_SWORD_TIER = new ForgeTier(6, 51, 30.f,
            10.0f, 25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(Items.NAPOLETANITE.get()));



}
