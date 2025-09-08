package net.ayoubmrz.muckcraftmod;

import net.ayoubmrz.muckcraftmod.block.ModBlocks;
import net.ayoubmrz.muckcraftmod.item.ModItemGroups;
import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.ayoubmrz.muckcraftmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

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

	}
}