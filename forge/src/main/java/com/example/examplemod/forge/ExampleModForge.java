package com.example.examplemod.forge;

import com.example.examplemod.ExampleMod;
import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {

    public ExampleModForge() {
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.

        // Use Forge to bootstrap the Common mod.
        ExampleMod.LOGGER.info("Hello Forge world!");
        ExampleMod.init();
    }
}
