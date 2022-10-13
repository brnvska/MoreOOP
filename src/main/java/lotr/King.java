package lotr;

import java.util.Random;

public class King extends Character{
    public static Random randomGenerator = new Random();
    public King() {
        super(randomGenerator.nextInt(10)+5, randomGenerator.nextInt(10)+5);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - randomGenerator.nextInt(getPower()));
    }

    public String toString() {
        return String.format("king{hp=%a, power= %a}",getHp(), getPower());
    }
}
