import Shop.DrumSticks;
import Shop.GuitarStrings;
import Shop.PianoKeys;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopItemsTest {
    DrumSticks drumSticks;
    PianoKeys pianoKeys;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        drumSticks = new DrumSticks("set of 2", 3, 9);
        pianoKeys = new PianoKeys("set of 50", 30, 100);
        guitarStrings = new GuitarStrings("set of 6", 3, 15);
    }

    @Test
    public void canGetDescription(){
        assertEquals("set of 50", pianoKeys.getDescription());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(3, drumSticks.getBoughtPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(15, guitarStrings.getSellPrice(), 0.001);
    }
}
