package gear;

public class Armour {

    private String name;
    private int protection;
    private int damage;

    public Armour(String name, int protection, int damage) {
        this.name = name;
        this.protection = protection;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
