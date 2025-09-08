package net.ayoubmrz.muckcraftmod;

import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.ayoubmrz.muckcraftmod.entity.ModEntities;
import net.ayoubmrz.muckcraftmod.entity.custom.*;
import net.ayoubmrz.muckcraftmod.item.ModItemGroups;
import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.ayoubmrz.muckcraftmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuckCraftMod implements ModInitializer {
	public static final String MOD_ID = "muckcraftmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		ModWorldGeneration.generateModWorldGen();

		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.GOBLIN, GoblinEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.LILDAVE, LilDaveEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.FIREDAVE, FireDaveEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.WATERDAVE, WaterDaveEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.LIGHTNINGDAVE, LightningDaveEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.BIGWOLF, BigWolfEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.ROCKGOLEM, RockGolemEntity.setAttributes());

		FabricDefaultAttributeRegistry.register(ModEntities.WYVERN, WyvernEntity.setAttributes());

	}
}