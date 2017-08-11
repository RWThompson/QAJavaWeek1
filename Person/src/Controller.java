import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */
public class Controller {

    public static void main(String[] args) {
        ListOfPeople l = new ListOfPeople();

        Person p = new Person("Dean Winchester", 30, "Hunter");
        l.addToList(p);
        Person p1 = new Person("Sam Winchester", 25, "Hunter");
        l.addToList(p1);
        Person p2 = new Person("Mike Ross", 25, "Lawyer");
        l.addToList(p2);
        Person p3 = new Person("Harvey Specter", 32, "Lawyer");
        l.addToList(p3);

        System.out.println("");
        System.out.println("People");

        l.printPerson();
        System.out.println("");
        System.out.println(l.findPerson("Mike Ross"));
    }
}
