import Shop.Shop;
import Shop.GuitarStrings;
import Shop.DrumSticks;
import Shop.ISell;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopTest {

    GuitarStrings strings;
    DrumSticks sticks;
    Shop shop;

    @Before
    public void before(){
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(strings);
        stock.add(sticks);
        shop = new Shop(stock);
    }

    @Test
    public void canGetEmptyStock(){
        assertNotNull(String.valueOf(2), shop.getStock());
    }

    @Test
    public void canRemoveStock(){
        ArrayList<ISell> stock = new ArrayList<ISell>();
        stock.add(strings);
        stock.add(sticks);
        stock.remove(sticks);
        assertNotNull(String.valueOf(1), shop.getStock());
    }

    @Test
    public void canAddStock(){
        
    }


}
