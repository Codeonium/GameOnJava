import artifacts.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {
    Potion potion;

    @Before
    public void setUp(){
        potion = new Potion("Buckfast",50);
    }

    @Test
    public void hasName() {
        assertEquals("Buckfast", potion.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(50, potion.getDamagePoints());
    }
}
