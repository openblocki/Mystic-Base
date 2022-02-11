package com.openblocki.mysticbase.item;

import com.openblocki.mysticbase.MysticBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ModItemGroup.MYSTICBASE));
    public static final Item MYST = new Item(new Item.Settings().group(ModItemGroup.MYSTICBASE));
    public static final Item RAWMYST = new Item(new Item.Settings().group(ModItemGroup.MYSTICBASE));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MysticBase.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(MysticBase.MOD_ID, "mysticalium"), MYST);
        Registry.register(Registry.ITEM, new Identifier(MysticBase.MOD_ID, "rawmyst"), RAWMYST);




    }

}
