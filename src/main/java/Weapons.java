import behaviours.IAttack;

public class Weapons implements IAttack {

    private String name;
    private String type;
    private int damagePoints;

    public Weapons(String name, String type, int damagePoints) {
        this.name = name;
        this.type = type;
        this.damagePoints = damagePoints;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


