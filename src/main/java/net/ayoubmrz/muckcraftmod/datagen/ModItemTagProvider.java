package net.ayoubmrz.muckcraftmod.datagen;

import net.ayoubmrz.muckcraftmod.item.ModItems;
import net.ayoubmrz.muckcraftmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.MITHRIL_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.MITHRIL_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.MITHRIL_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.MITHRIL_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MITHRIL_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.ADAMANTITE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.ADAMANTITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.ADAMANTITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.ADAMANTITE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.ADAMANTITE_HOE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OBAMIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OBAMIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OBAMIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OBAMIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OBAMIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MITHRIL_HELMET)
                .add(ModItems.MITHRIL_CHESTPLATE)
                .add(ModItems.MITHRIL_LEGGINGS)
                .add(ModItems.MITHRIL_BOOTS)

                .add(ModItems.ADAMANTITE_HELMET)
                .add(ModItems.ADAMANTITE_CHESTPLATE)
                .add(ModItems.ADAMANTITE_LEGGINGS)
                .add(ModItems.ADAMANTITE_BOOTS)

                .add(ModItems.OBAMIUM_HELMET)
                .add(ModItems.OBAMIUM_CHESTPLATE)
                .add(ModItems.OBAMIUM_LEGGINGS)
                .add(ModItems.OBAMIUM_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.MITHRIL_PICKAXES)
                .add(ModItems.MITHRIL_PICKAXE)
                .add(ModItems.ADAMANTITE_PICKAXE)
                .add(ModItems.OBAMIUM_PICKAXE);

        getOrCreateTagBuilder(ModTags.Items.ADAMANTITE_PICKAXES)
                .add(ModItems.ADAMANTITE_PICKAXE)
                .add(ModItems.OBAMIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.MITHRIL_PICKAXE)
                .add(ModItems.ADAMANTITE_PICKAXE)
                .add(ModItems.OBAMIUM_PICKAXE);

    }
}
