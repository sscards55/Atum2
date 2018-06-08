package com.teammetallurgy.atum.world.biome;

import com.teammetallurgy.atum.world.biome.base.AtumBiome;
import com.teammetallurgy.atum.world.gen.feature.WorldGenRuins;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import javax.annotation.Nonnull;
import java.util.Random;

public class BiomeRuinedCity extends AtumBiome {
    protected final WorldGenerator genRuins;

    public BiomeRuinedCity(AtumBiomeProperties properties) {
        super(properties);

        this.genRuins = new WorldGenRuins();

        this.pyramidRarity = -1;
        this.deadwoodRarity = 2;

        this.addDefaultSpawns();
    }

    @Override
    public void decorate(@Nonnull World world, @Nonnull Random random, @Nonnull BlockPos pos) {
        int x = random.nextInt(16) + 8;
        int z = random.nextInt(16) + 8;
        int height = world.getHeight(pos.add(x, 0, z)).getY() * 2;

        if (height > 0) {
            int randomHeight = random.nextInt(height);
            this.genRuins.generate(world, random, pos.add(x, randomHeight, z));
        }
        super.decorate(world, random, pos);
    }
}