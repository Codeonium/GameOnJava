public class Spells {
    private String name;
    private int healPoints;

    public Spells(String name, int healPoints){
        this.name = name;
        this.healPoints = healPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
