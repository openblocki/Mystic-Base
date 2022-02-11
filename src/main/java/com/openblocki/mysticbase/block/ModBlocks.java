package com.openblocki.mysticbase.block;

import com.openblocki.mysticbase.MysticBase;
import com.openblocki.mysticbase.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(5f).requiresTool()), ModItemGroup.MYSTICBASE);

    public static final Block MYSTICALIUM_BLOCK = registerBlock("mysticalium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),ModItemGroup.MYSTICBASE);

    public static final Block MYSTICALIUM_ORE = registerBlock("mysticalium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.MYSTICBASE);

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.MYSTICBASE);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return  Registry.register(Registry.BLOCK, new Identifier(MysticBase.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MysticBase.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }


            public static void registerModBlocks() {
                MysticBase.LOGGER.info("Registering ModBlocks for" + MysticBase.MOD_ID);
    }
}
