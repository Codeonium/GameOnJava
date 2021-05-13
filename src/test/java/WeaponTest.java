import gear.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;


    @Before
    public void setUp() {
        weapon = new Weapon("Excaliber", "Sword",30);
    }

    @Test
    public void hasAxe() {
        weapon = new Weapon("GoblinCleaver","Axe", 40);
        assertEquals("Axe", weapon.getType());
    }

    @Test
    public void hasName() {
        assertEquals("Excaliber", weapon.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(30, weapon.getDamagePoints());
    }



}



