package com.openblocki.mysticbase.mixin;

import com.openblocki.mysticbase.MysticBase;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .requiresTool()
            .strength(5.0f,30.0f)
            .sounds(BlockSoundGroup.AMETHYST_BLOCK));

    public static void registerBLocks(){
        Registry.register(Registry.BLOCK, new Identifier(MysticBase.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
