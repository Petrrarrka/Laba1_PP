import java.util.Random;

public class AttackDroid extends Droid {
    private int doubleDamage;

    public AttackDroid(String name, int health, int damage, int doubleDamage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.doubleDamage = doubleDamage;
    }

    @Override
    public void attack(Droid target) {
            if(doubleDamage> new Random().nextInt(101)){
                System.out.println(this.name+" get double damage");
                target.getHit(damage*2);
            }
            else
                target.getHit(damage);
    }
}