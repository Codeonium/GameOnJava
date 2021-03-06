package artifacts;

import behaviours.IHeal;

public class Potion implements IHeal {
    private String name;
    private int damagePoints;

    public Potion(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
