package lotr;

import lombok.SneakyThrows;

import java.lang.reflect.Array;
import java.util.Random;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Character[] characterArray = { new Hobbit(), new King(), new Knight(), new Elf()};
        int choice = new Random().nextInt(characterArray.length);
        return  characterArray[choice];
    }
}
