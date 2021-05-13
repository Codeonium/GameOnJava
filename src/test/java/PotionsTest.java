import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionsTest {
    Potions potions;

    @Before
    public void setUp(){
        potions = new Potions("Buckfast",50);
    }

    @Test
    public void hasName() {
        assertEquals("Buckfast",potions.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(50, potions.getDamagePoints());
    }
}
