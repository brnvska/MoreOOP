package lotr;

public class GameManager {
    public static void battle(Character player1, Character player2) {

        while (player1.isAlive() && player2.isAlive()) {
            player1.kick(player2);
            System.out.println(player1.toString() + " just kicked " + player2.toString());
            System.out.println("c2 player status: " + player2.toString());

            if (player2.isAlive()) {
                player2.kick(player1);
                System.out.println("Revenge! " + player2.toString() + " just kicked " + player1.toString());
                System.out.println("c1 player status: " + player1.toString());
            }
        }
        if (player1.isAlive()) {
            System.out.println("Flawless victory! Player " + player1.toString() + " wins the game!!! ");
        } else if (player2.isAlive()) {
            System.out.println("Flawless victory! Player " + player2.toString() + " wins the game!!! ");
        }
    }
}
