package io.github.jamalam360.jamtastic.fabric;

import io.github.jamalam360.jamtastic.Jamtastic;
import net.fabricmc.api.ModInitializer;

public class JamtasticFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Jamtastic.init();
    }
}
