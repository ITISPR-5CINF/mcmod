package it.pr.itis.quartacinf.quartacinfmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

// This class is used to put veins in a specific level of the world (Y - axes) -> // VerticalAnchor.aboveBottom(level);
public class ModPlacedFeatures
{
    public static final Holder<PlacedFeature> NAPOLETANITE_ORE_PLACED = PlacementUtils.register("napoletanite_ore_placed",
            it.pr.itis.quartacinf.quartacinfmod.world.feature.ModConfiguredFeatures.NAPOLETANITE_ORE, it.pr.itis.quartacinf.quartacinfmod.world.feature.ModOrePlacement.commonOrePlacement(2, //How many veins are in a chunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-88), VerticalAnchor.aboveBottom(88))));
}
