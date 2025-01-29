package com.teachmeskills.lesson_30.task2;

import com.teachmeskills.lesson_30.task2.factory.CharacterFactory;
import com.teachmeskills.lesson_30.task2.factory.TerrainFactory;
import com.teachmeskills.lesson_30.task2.model.character.Character;
import com.teachmeskills.lesson_30.task2.model.terrain.Terrain;

import java.util.Scanner;

/**
 * 2. Design a small game where the player can select characters with different abilities
 * and terrain using the Factory pattern. Create a method that will generate descriptions
 * of the situation depending on the selected character and terrain.
 * For example, if the user selects:
 * Character: Mage
 * Terrain: Desert
 * then we will see:
 * "A mage with a long robe and a magic wand is in a hot desert with sand dunes and rare plants."
 */
public class Game {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Select a character (mage, warrior, archer): ");
            String characterType = sc.nextLine();
            Character character = CharacterFactory.createCharacter(characterType);

            System.out.println("Select the location (desert, forest, mountain): ");
            String terrainType = sc.nextLine();
            Terrain terrain = TerrainFactory.createTerrain(terrainType);

            String unitDescription = character.getDescription() + " is located in " + terrain.getDescription();
            System.out.println(unitDescription);
        }
    }
}
