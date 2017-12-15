import Instrumental.InstrumentType;
import Instrumental.Triangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void before(){
        triangle=  new Triangle(InstrumentType.METAL, "metal", "silver", 5, 15, 3);
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.METAL, triangle.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("metal", triangle.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("silver", triangle.getColour());
    }

    @Test
    public void canGetStrings(){
        assertEquals(3, triangle.getNumEdges());
    }

    @Test
    public void canPlay(){
        assertEquals("The song playing is: Teardrops", triangle.play("Teardrops"));
    }
}
