import java.util.Random;

public class StealDroid extends Droid{
    int steal;

    public StealDroid(String name, int health, int damage, int steal) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.steal = steal;

    }

    @Override
    public void attack(Droid target) {
        if (steal > new Random().nextInt(101)){
            this.health += 10;
            target.getHit(damage);
            System.out.println(name + " has stolen 10hp");
        }
        target.getHit(damage);
    }
}
