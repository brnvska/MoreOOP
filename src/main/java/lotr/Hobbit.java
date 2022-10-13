package lotr;

public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    public void kick(Character c) {
        System.out.println("Hobbit is crying" + "涙涙涙");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}
