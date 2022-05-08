package it.pr.itis.quartacinf.quartacinfmod.register;

import it.pr.itis.quartacinf.quartacinfmod.QuartaCInfMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, QuartaCInfMod.MOD_ID);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(QuartaCInfMod.MOD_ID, name)));
    }

    private static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }

    public static final RegistryObject<SoundEvent> TARANTELLA_NAPOLETANA = registerSoundEvent("tarantella_music");
}
