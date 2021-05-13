import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellsTest {
    Spells spells;

    @Before
    public void setUp() {
        spells = new Spells("FireHeal", 12);
    }

    @Test
    public void hasName() {
        assertEquals("FireHeal", spells.getName());
    }
    @Test
    public void hasHealPoints() {
        assertEquals(12, spells.getHealPoints());
    }
}