package rpg;

import java.util.Random;

public abstract class Hero {
    protected String name;
    protected int health;
    protected int strength;
    protected static Random r = new Random(34);

    public Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public abstract void attack(Hero other);

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
