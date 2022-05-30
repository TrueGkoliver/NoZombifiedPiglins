package com.gkoliver.nozombifiedpiglins.mixin;


import net.minecraft.core.BlockPos;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value= NetherPortalBlock.class)
public abstract class NetherPortalBlockMixin extends Block {
    protected NetherPortalBlockMixin(Properties properties) {
        super(properties);
    }
    @Inject(method= "randomTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Ljava/util/Random;)V", at=@At("HEAD"), cancellable = true)
    private void randomTickI(BlockState state, ServerLevel worldIn, BlockPos pos, Random random, @NotNull CallbackInfo ci) {
        ci.cancel();
    }
}
