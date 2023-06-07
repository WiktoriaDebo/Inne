package rpg;

public class Human extends Hero{
    private static String[] names = {"Aragorn", "Bormomir", "Faramir", "Theoden"};
    public Human(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Human GetInstance(){
        String name = names[r.nextInt(names.length)];
        int health = 50+r.nextInt(101);
        int strength= 20+r.nextInt(21) ;
        return new Human (name,health,strength);
    };

    @Override
    public void attack(Hero other) {
        int damage = (int)(this.getStrength()*r.nextDouble());
        other.setHealth(getHealth()-damage);
        System.out.println(this.getName() + " atakuje " + other.getName() + " zadaje " + damage + " obraen. ");
    }

    @Override
    public String toString() {
        return "Human{" + "name = " + getName() + ", health = " + getHealth()+ ", strength = "+ getStrength() +'}';
    }
}
