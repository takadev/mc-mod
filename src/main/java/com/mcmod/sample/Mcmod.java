package com.mcmod.sample;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = Mcmod.MOD_ID, version = Mcmod.MOD_VERSION)
public class Mcmod {
    public static final String MOD_ID = "mcmod";
    public static final String MOD_VERSION = "0.1";

    public static Item ruby;
    public static Item ruby_pickaxe;
    public static Item ruby_sword;
    public static Item ruby_axe;
    public static Item ruby_hoe;
    public static Item ruby_shovel;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ruby = new Item()
                .setCreativeTab(CreativeTabs.MATERIALS)
                .setUnlocalizedName("ruby")
                .setRegistryName("ruby")
                .setMaxStackSize(64);

        ruby_pickaxe = new RubyPickaxe(EnumHelper.addToolMaterial("ruby_pickaxe", 1, 1000, 15, 11, 1))
                .setUnlocalizedName("ruby_pickaxe")
                .setRegistryName("ruby_pickaxe");

        ruby_sword = new RubySword(EnumHelper.addToolMaterial("ruby_sword", 1, 1000, 5, 7, 1))
                .setUnlocalizedName("ruby_sword")
                .setRegistryName("ruby_sword");

        ruby_axe = new RubyAxe(EnumHelper.addToolMaterial("ruby_exe", 1, 1000, 5, 7, 1), 30f, 0.8f)
                .setUnlocalizedName("ruby_axe")
                .setRegistryName("ruby_axe");

        ruby_hoe = new RubyHoe(EnumHelper.addToolMaterial("ruby_hoe", 1, 1000, 5, 7, 1))
                .setUnlocalizedName("ruby_hoe")
                .setRegistryName("ruby_hoe");

        ruby_shovel = new RubyShovel(EnumHelper.addToolMaterial("ruby_shovel", 1, 1000, 30, 20, 3))
                .setUnlocalizedName("ruby_shovel")
                .setRegistryName("ruby_shovel");

        ForgeRegistries.ITEMS.register(ruby);
        ForgeRegistries.ITEMS.register(ruby_pickaxe);
        ForgeRegistries.ITEMS.register(ruby_sword);
        ForgeRegistries.ITEMS.register(ruby_axe);
        ForgeRegistries.ITEMS.register(ruby_hoe);
        ForgeRegistries.ITEMS.register(ruby_shovel);

        if (event.getSide().isClient()) {
            ModelLoader.setCustomModelResourceLocation(ruby, 0, new ModelResourceLocation("mcmod:ruby"));
            ModelLoader.setCustomModelResourceLocation(ruby_pickaxe, 0, new ModelResourceLocation("mcmod:ruby_pickaxe"));
            ModelLoader.setCustomModelResourceLocation(ruby_sword, 0, new ModelResourceLocation("mcmod:ruby_sword"));
            ModelLoader.setCustomModelResourceLocation(ruby_axe, 0, new ModelResourceLocation("mcmod:ruby_axe"));
            ModelLoader.setCustomModelResourceLocation(ruby_hoe, 0, new ModelResourceLocation("mcmod:ruby_hoe"));
            ModelLoader.setCustomModelResourceLocation(ruby_shovel, 0, new ModelResourceLocation("mcmod:ruby_shovel"));
        }
    }
}
