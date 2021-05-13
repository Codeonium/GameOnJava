public class Weapons {

    private String name;
    private int type;
    private int damagePoints;

    public Weapons(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}


