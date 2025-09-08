package net.ayoubmrz.muckcraftmod;

import net.ayoubmrz.muckcraftmod.entity.ModEntities;
import net.ayoubmrz.muckcraftmod.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MuckCraftModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.GOBLIN, GoblinRenderer::new);
        EntityRendererRegistry.register(ModEntities.LILDAVE, LilDaveRenderer::new);
        EntityRendererRegistry.register(ModEntities.FIREDAVE, FireDaveRenderer::new);
        EntityRendererRegistry.register(ModEntities.WATERDAVE, WaterDaveRenderer::new);
        EntityRendererRegistry.register(ModEntities.LIGHTNINGDAVE, LightningDaveRenderer::new);
        EntityRendererRegistry.register(ModEntities.BIGWOLF, BigWolfRenderer::new);
        EntityRendererRegistry.register(ModEntities.ROCKGOLEM, RockGolemRenderer::new);
        EntityRendererRegistry.register(ModEntities.WYVERN, WyvernRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(BoneProjectileModel.ANCIENTBONE, BoneProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ANCIENTBONE, BoneProjectileRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(BallProjectileModel.BALL, BallProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BALL, BallProjectileRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(RockProjectileModel.ROCK, RockProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.ROCK, RockProjectileRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SmallRockProjectileModel.SMALLROCK, SmallRockProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SMALLROCK, SmallRockProjectileRenderer::new);

    }
}
