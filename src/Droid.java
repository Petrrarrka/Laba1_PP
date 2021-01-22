import java.util.Random;

public class Droid {
    protected String name;
    protected int health;
    protected int accuracy;
    protected int damage;



    public Droid(){}
    public Droid(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public boolean isAlive() { return this.health > 0; }
    public void setDamage(int damage) { this.damage = damage; }
    public String getName() { return name; }


    public int getDamage() { return damage; }
    public int getHealth() { return health; }
    public void getHit(int damage) { this.health -= damage; }
    public int getAccuracy() { return accuracy; }


    @Override
    public String toString() {
        return "name = " + name + "  " +
                "HP = " + health + "  " +
                "damage = " + damage;
    }
    public void attack(Droid target){ }

}
