package com.teachmeskills.lesson_30.task2.factory;

import com.teachmeskills.lesson_30.task2.model.character.Character;
import com.teachmeskills.lesson_30.task2.model.character.characterImpl.Archer;
import com.teachmeskills.lesson_30.task2.model.character.characterImpl.Mage;
import com.teachmeskills.lesson_30.task2.model.character.characterImpl.Warrior;

public class CharacterFactory {
    public static Character createCharacter(String type) {
        return switch (type.toLowerCase()) {
            case "mage" -> new Mage();
            case "warrior" -> new Warrior();
            case "archer" -> new Archer();
            default -> throw new IllegalArgumentException("Invalid character type: " + type);
        };
    }
}
