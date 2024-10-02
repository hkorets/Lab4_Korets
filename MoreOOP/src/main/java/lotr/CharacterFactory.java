package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    static Random random = new Random();
    private static final List<String> CHARACTER_CLASSES = Arrays.asList(
            "lotr.Hobbit",
            "lotr.Elf",
            "lotr.King",
            "lotr.Knight"
    );
    public static Character createCharacter() {
        int characterType = random.nextInt(CHARACTER_CLASSES.size());
        String className = CHARACTER_CLASSES.get(characterType);

        try {
            Class<?> clazz = Class.forName(className);
            return (Character) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

