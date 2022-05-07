package it.pr.itis.quartacinf.quartacinfmod.util;

import it.pr.itis.quartacinf.quartacinfmod.setup.Registration;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTier {
    public static final ForgeTier NAPOLETANITE_TIER = new ForgeTier(5, 3200, 0f,
            0.0f, 20, BlockTags.NEEDS_DIAMOND_TOOL,() -> Ingredient.of(Registration.NAPOLETANITE.get()));
}
