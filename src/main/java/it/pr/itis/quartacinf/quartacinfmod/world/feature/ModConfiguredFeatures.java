package it.pr.itis.quartacinf.quartacinfmod.world.feature;

import it.pr.itis.quartacinf.quartacinfmod.register.Blocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_NAPOLETANITE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, Blocks.NAPOLETANITE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NAPOLETANITE_ORE = FeatureUtils.register("napoletanite_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_NAPOLETANITE_ORES, 9));
}
