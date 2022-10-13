package lotr;

import java.util.Random;

public class Knight extends Character{
    public static Random randomGenerator = new Random();
    public Knight(){
        super(randomGenerator.nextInt(10)+2, randomGenerator.nextInt(10)+2);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - randomGenerator.nextInt(getPower()));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}
