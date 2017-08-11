import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */
public class ListOfPeople {

    ArrayList<Person> list;

    public ListOfPeople() {
        list = new ArrayList<Person>();
    }

    public void addToList(Person p) {
        list.add(p);
    }

    public ArrayList getList() {
        return list;
    }

    public void printPerson() {
        for(Person p : list) {
            System.out.println(p.toString());
        }
    }

    public String findPerson(String n) {
        String r = "";
        for(Person p : list) {
            if(p.getName().equals(n)) {
                r = p.toString();
            }
        }
        return r;
    }
}
