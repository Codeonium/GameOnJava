package herosAndBadguys;

import artifacts.Potion;
import behaviours.IHeal;
import gear.Weapon;

import java.util.ArrayList;

public class Cleric {

    private ArrayList<Potion> potion;

    public void Cleric(ArrayList<Potion> potion) {
        this.potion = potion;

    }

    public ArrayList<Potion> getPotion() {
        return potion;
    }

    public void setPotion(ArrayList<Potion> potion) {
        this.potion = potion;
    }
}
