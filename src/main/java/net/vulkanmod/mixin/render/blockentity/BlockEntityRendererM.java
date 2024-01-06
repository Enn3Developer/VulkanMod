package net.vulkanmod.mixin.render.blockentity;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.vulkanmod.Initializer;
import net.vulkanmod.config.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BlockEntityRenderer.class)
public interface BlockEntityRendererM {
    /**
     * @author
     * @reason
     */
    @Overwrite
    default int getViewDistance() {
        return Initializer.CONFIG.blockEntityViewDistance;
    }
}
