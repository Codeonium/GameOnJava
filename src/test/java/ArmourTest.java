import gear.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour armour;

    @Before
    public void setUp() {
        armour = new Armour("GoldenMail",150,200);
    }
    @Test
    public void hasName(){
        assertEquals("GoldenMail", armour.getName());
    }
    @Test
    public void hasProtection(){
        assertEquals(150, armour.getProtection());
    }
    @Test
    public void hasDamage() {
        assertEquals(200, armour.getDamage());
    }
}
