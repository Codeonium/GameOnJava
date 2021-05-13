import magicspells.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    Spell spell;

    @Before
    public void setUp() {
        spell = new Spell("FireHeal", 12);
    }

    @Test
    public void hasName() {
        assertEquals("FireHeal", spell.getName());
    }
    @Test
    public void hasHealPoints() {
        assertEquals(12, spell.getHealPoints());
    }
}