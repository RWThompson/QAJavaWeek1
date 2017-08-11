import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Created by Administrator on 10/08/2017.
 */
public class TestCustomer {

    ArrayList<Resource> list = new ArrayList<>();
    Customer c = new Customer("Harvey Specter", list);
    Resource r = new Journal("The Computer Journal", "Various", true, 10);
    Resource r2 = new Dissertation("Developing an Algorithm", "Mike Ross", true, 70, false);
    //Person p = new Customer("Harvey Specter", list);

    @Before
    @Test
    public void testAddToList() {
        c.addToList(r);
        c.addToList(r2);
        assertEquals(2, c.rList.size());
    }

    @Test
    public void testRemoveFromList() {
        c.removeFromList(r);
        assertEquals(1, c.rList.size());
    }

    @Test
    public void testEmptyList() {
        c.emptyList();
        assertEquals(0, c.rList.size());
    }
}
