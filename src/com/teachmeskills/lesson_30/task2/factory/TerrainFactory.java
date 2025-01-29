package com.teachmeskills.lesson_30.task2.factory;

import com.teachmeskills.lesson_30.task2.model.terrain.Terrain;
import com.teachmeskills.lesson_30.task2.model.terrain.terrainImpl.Desert;
import com.teachmeskills.lesson_30.task2.model.terrain.terrainImpl.Forest;
import com.teachmeskills.lesson_30.task2.model.terrain.terrainImpl.Mountain;

public class TerrainFactory {
    public static Terrain createTerrain(String type) {
        return switch (type.toLowerCase()) {
            case "desert" -> new Desert();
            case "mountain" -> new Mountain();
            case "forest" -> new Forest();
            default -> throw new IllegalArgumentException("Unknown terrain type: " + type);
        };
    }
}
