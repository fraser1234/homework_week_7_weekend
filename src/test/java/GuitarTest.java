import Instrumental.Guitar;
import Instrumental.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar =  new Guitar(InstrumentType.BRASS, "wood", "blue", 30, 70, 6);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.BRASS, guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("blue", guitar.getColour());
    }

    @Test
    public void canGetStrings(){
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void canSetStrings(){
        guitar.setNumStrings(4);
        assertEquals(4, guitar.getNumStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("The song playing is: Teardrops", guitar.play("Teardrops"));
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(30, guitar.getBoughtPrice(), 0.001);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(70, guitar.getSellPrice(), 0.001);
    }

    @Test
    public void canSetBoughtPrice(){
        guitar.setBoughtPrice(25);
        assertEquals(25, guitar.getBoughtPrice(), 0.001);
    }

    @Test
    public void canSetSellPrice(){
        guitar.setSellPrice(90);
        assertEquals(90, guitar.getSellPrice(), 0.001);
    }

    @Test
    public void canGetGuitarMarkUp(){
        assertEquals(133.33, guitar.calculateMarkup(), 0.01);
    }


}
