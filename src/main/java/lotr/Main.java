package lotr;

public class Main {
    public static void main(String[] args) {
        Character player1 = CharacterFactory.createCharacter();
        Character player2 = CharacterFactory.createCharacter();
        System.out.println(player1);
        System.out.println(player2);
        GameManager.battle(player1, player2);
    }
}
