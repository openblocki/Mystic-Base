package com.openblocki.mysticbase;

import com.openblocki.mysticbase.mixin.ModBlocks;
import com.openblocki.mysticbase.mixin.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MysticBase implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("modid");
    public static final String MOD_ID = "mysticbase";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBLocks();
        LOGGER.info("Fuck of Mate");
    }

}
