import Instrumental.Piano;
import Instrumental.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano =  new Piano(InstrumentType.BRASS, "brass", "brown", 50,  100, 50);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.BRASS, piano.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", piano.getColour());
    }

    @Test
    public void canGetStrings(){
        assertEquals(50, piano.getNumKeys());
    }

    @Test
    public void canSetStrings(){
        piano.setNumKeys(48);
        assertEquals(48, piano.getNumKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("The song playing is: Teardrops", piano.play("Teardrops"));
    }

}
