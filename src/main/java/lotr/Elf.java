package lotr;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        }
        else{
            c.setHp(Math.max(0, c.getHp()-1));
        }
    }

    public String toString() {
        return String.format("Elf{hp=%a, power=%a",getPower(),  getHp());
    }
}
