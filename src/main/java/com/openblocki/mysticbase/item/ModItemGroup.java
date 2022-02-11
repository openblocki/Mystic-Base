package com.openblocki.mysticbase.item;

import com.openblocki.mysticbase.MysticBase;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MYSTICBASE = FabricItemGroupBuilder.build(new Identifier(MysticBase.MOD_ID,"mysticbase"),
            () -> new ItemStack(ModItems.MYST));
}
