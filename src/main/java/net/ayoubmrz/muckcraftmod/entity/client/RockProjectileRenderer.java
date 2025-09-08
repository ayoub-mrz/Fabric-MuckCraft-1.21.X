package net.ayoubmrz.muckcraftmod.entity.client;

import net.ayoubmrz.muckcraftmod.MuckCraftMod;
import net.ayoubmrz.muckcraftmod.entity.custom.RockProjectileEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class RockProjectileRenderer extends EntityRenderer<RockProjectileEntity> {
    protected RockProjectileModel model;

    public RockProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new RockProjectileModel(ctx.getPart(RockProjectileModel.ROCK));
    }

    @Override
    public void render(RockProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        matrices.scale(1.4f, 1.4f, 1.4f);

        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/rock.png")), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(RockProjectileEntity entity) {
        return Identifier.of(MuckCraftMod.MOD_ID, "textures/entity/rock.png");
    }
}
