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

    public static final RegistryObject<SoundEvent> TARANTELLA_NAPOLETANA = registerSoundEvent("tarantella_music");
    public static final RegistryObject<SoundEvent> FUNICULI_FUNICULA = registerSoundEvent("funiculi_funicula_music");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(QuartaCInfMod.MOD_ID, name)));
    }

    /**
     * NON USARE!
     * Registra l'event bus.
     * Questo metodo deve essere utilizzato solo dal construttore della mod.
     */
    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
