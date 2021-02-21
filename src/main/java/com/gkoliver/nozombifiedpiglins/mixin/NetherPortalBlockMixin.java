package com.gkoliver.nozombifiedpiglins.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherPortalBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value=NetherPortalBlock.class)
public class NetherPortalBlockMixin extends Block  {
    public NetherPortalBlockMixin(Properties properties) {
        super(properties);
    }
    @Inject(method="randomTick", at=@At("HEAD"), cancellable = true)
    private void randomTickI(BlockState state, ServerWorld worldIn, BlockPos pos, Random random, CallbackInfo ci) {
        System.out.println("It's ticking, fools!");
        ci.cancel();
    }
}
