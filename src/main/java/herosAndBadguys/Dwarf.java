package herosAndBadguys;

import gear.Weapon;

import java.util.ArrayList;

public class Dwarf {

    private String weaponInHand;
    private ArrayList<Weapon> weapon;

    public void Dwarf(String weaponInHand, ArrayList<Weapon> weapon) {
        this.weapon = weapon;
        this.weapon = weapon;

    }

    public String getWeaponInHand() {
        return weaponInHand;
    }

    public void setWeaponInHand(String weaponInHand) {
        this.weaponInHand = weaponInHand;
    }

    public ArrayList<Weapon> getWeapon() {
        return weapon;
    }

    public void setWeapon(ArrayList<Weapon> weapon) {
        this.weapon = weapon;
    }
}
