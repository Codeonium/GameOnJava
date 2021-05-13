package herosAndBadguys;

import magicspells.Spell;

import java.util.ArrayList;

public class Wizard {

    private ArrayList<Spell> spell;
    private String creature;

    public void Wizard(String creature, ArrayList<Spell> spell) {
        this.creature = creature;
        this.spell = spell;
    }

    public ArrayList<Spell> getSpell() {
        return spell;
    }

    public void setSpell(ArrayList<Spell> spell) {
        this.spell = spell;
    }

    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }
}



