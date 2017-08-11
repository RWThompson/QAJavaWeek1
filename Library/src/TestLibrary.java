import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 10/08/2017.
 */
public class TestLibrary {

    ArrayList<Resource> cList = new ArrayList<>();
    Library l = new Library();
    Resource b = new Book("A Knight of the Seven Kingdoms", "George R R Martin", true, "Fantasy", 645, "Publisher", "5123-213437");
    Resource d = new Dissertation("The Family Business", "Dean Winchester", true, 0, true);
    Resource j = new Journal("The Computer Journal", "QA Consulting", true, 0);
    Person c = new Customer(cList, "Rick Sanchez");
    Person e = new Employee("Bruce Wayne", "Librarian");

    @Test public void testCheckResourceOut() {
        l.checkResourceOut();
        assertEquals(1, l.pList.get(c).getBListSize());
        assertTrue(false, l.rList.get(b).getIsAvailable());
    }

    @Test public void testCheckResourceIn() {
        l.checkResourceIn();
        assertEquals(0, l.pList.get(c).getBListSize());
        assertTrue(true, l.rList.get(b).getIsAvailable());
    }

    @Test public void testAddResource() {
        l.addResource(b);
        assertEquals(1, l.rList.size());
    }

    @Test public void testRemoveResource() {
        l.removeResource(b);
        assertEquals(0, l.rList.size());
    }

    @Test public void testUpdateResourceBook() {
        l.updateResource(b, "A Game of Thrones", "George R R Martin", true, "Fantasy", 645, "Publisher", "5123-213437");
        assertEquals("A Game of Thrones", l.rList.get(b).getName());
    }

    @Test public void testUpdateResourceDissertation() {
        l.updateResource(d, "The Family Business", "Dean Winchester", true, 0, false);
        assertTrue(false, l.rList.get(d).getCodePresent());
    }

    @Test public void testUpdateResourceJournal() {
        l.updateResource(j, "The Computer Journal", "QA Consulting", true, 2);
        assertEquals(2, l.rList.get(j).getIssueNum());
    }

    @Test public void testRegisterPerson() {
        l.registerPerson(c);
        assertEquals(1, l.pList.size());
    }

    @Test public void deletePerson() {
        l.deletePerson(c);
        assertEquals(0, l.pList.size());
    }

    @Test public void testUpdatePersonCustomer() {
        l.updatePerson(Person c, cList, "Rick Sanchez");
        assertEquals("Clark Kent", l.pList.get(c).getName());
    }

    @Test public void testUpdatePersonEmployee() {
        l.updatePerson(Person e, "Bruce Wayne", "Manager");
        assertEquals("Manager", l.pList.get(e).getName());
    }

    @Test public void testReadFromFileResources() {
        ArrayList temp = ArrayList(l.readFromFileResource());
        assertEquals(0, temp.size());
    }

    @Test public void testReadFromFilePerson() {
        ArrayList temp = ArrayList(l.readFromFilePerson());
        assertEquals(0, temp.size());
    }
}
