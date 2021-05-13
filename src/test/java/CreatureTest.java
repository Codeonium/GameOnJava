import creatures.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {
    Creature creature;

    @Before
    public void setUp() {
        creature = new Creature("Ogre", 10, 20);
    }
    @Test
    public void hasName() {
        assertEquals("Ogre", creature.getName());
    }
    @Test
    public void hasDefence() {
        assertEquals(10, creature.getDefence());
    }
    @Test
    public void hasAttack(){
        assertEquals(20, creature.getAttack());
    }
}
