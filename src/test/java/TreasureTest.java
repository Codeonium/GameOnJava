import artifacts.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {
    Treasure treasure;

    @Before
    public void setUp() {
        treasure = new Treasure("GoldenBox");
    }
    @Test
    public void hasName() {
        assertEquals("GoldenBox", treasure.getName());
    }
}
