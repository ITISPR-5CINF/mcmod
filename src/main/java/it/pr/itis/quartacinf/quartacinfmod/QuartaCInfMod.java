package it.pr.itis.quartacinf.quartacinfmod;

import it.pr.itis.quartacinf.quartacinfmod.setup.Registration;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(QuartaCInfMod.MOD_ID)
public class QuartaCInfMod {
    public static final String MOD_ID = "quartacinfmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public QuartaCInfMod() {
        Registration.register();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
