import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Administrator on 10/08/2017.
 */
public class TestSearchSort {

    Library l = new Library();

    @Test public void testBubbleSort() {
        Person e = new Employee("Bruce Wayne", "Librarian");
        l.registerPerson(e);
        Person e1 = new Employee("Barry Allen", "Manager");
        l.registerPerson(e1);
        Person e2 = new Employee("Hal Jordan", "Librarian");
        l.registerPerson(e2);
        Person e3 = new Employee("Diana Prince", "Assistant Manager");
        l.registerPerson(e3);
        Person e4 = new Employee("Clark Kent", "Librarian");
        l.registerPerson(e4);

        l.bubbleSort(l.pList);

        assertEquals("Barry Allen", l.pList.get(0).getName());
        assertEquals("Bruce Wayne", l.pList.get(1).getName());
        assertEquals("Clark Kent", l.pList.get(2).getName());
        assertEquals("Diana Prince", l.pList.get(3).getName());
        assertEquals("Hal Jordan", l.pList.get(4).getName());
    }
}
