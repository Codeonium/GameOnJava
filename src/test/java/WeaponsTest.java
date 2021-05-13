import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponsTest {

    Weapons weapons;


    @Before
    public void setUp() {
        weapons = new Weapons("Excaliber", "Sword",30);
    }

    @Test
    public void hasAxe() {
        weapons = new Weapons("GoblinCleaver","Axe", 40);
        assertEquals("Axe", weapons.getType());
    }

    @Test
    public void hasName() {
        assertEquals("Excaliber", weapons.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(30, weapons.getDamagePoints());
    }



}



