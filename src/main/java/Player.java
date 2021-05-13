import races.Race;

import java.util.ArrayList;

public class Player {
    private String name;
    private int level;
    private Race race;
    private ArrayList<Bag> bag;

    public Player(String name, Race race, int level){
        this.name = name;
        this.race = race;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
