package com.mavesutilities.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;

public class MavesSaplingBlock extends SaplingBlock {

    public MavesSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
}