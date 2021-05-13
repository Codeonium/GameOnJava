package herosAndBadguys;

import gear.Weapon;

import java.util.ArrayList;

public class Knight {

    private String weaponInHand;
    private ArrayList<Weapon> weapon;

    public void Knight(String weaponInHand, ArrayList<Weapon> weapon) {
        this.weapon = weapon;
        this.weaponInHand = weaponInHand;

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
