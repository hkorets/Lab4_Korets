package lotr;

import lotr.Character;
import lotr.CharacterFactory;

public class Main {
    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        if (c1 != null && c2 != null) {
            GameManager gameManager = new GameManager();
            gameManager.fight(c1, c2);
        } else {
            System.out.println("Failed to create characters.");
        }
    }
}

