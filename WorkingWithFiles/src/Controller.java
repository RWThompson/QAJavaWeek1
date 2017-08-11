import java.util.ArrayList;

/**
 * Created by Administrator on 09/08/2017.
 */
public class Controller {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Person p = new Person("Mike Ross", "Lawyer", 25);
        list.add(p);
        Person p1 = new Person("Harvey Specter", "Lawyer", 30);
        list.add(p1);
        Person p2 = new Person("Dean Winchester", "Hunter", 30);
        list.add(p2);
        Person p3 = new Person("Sterling Archer", "Spy", 27);
        list.add(p3);
        Person p4 = new Person("Rick Sanchez", "Scientist", 55);
        list.add(p4);

        p.writeToFile(list);
        p.readFromFile();
    }


}
