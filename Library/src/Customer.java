import java.util.ArrayList;

/**
 * Created by Administrator on 10/08/2017.
 */
public class Customer extends Person{

    ArrayList<Resource> rList = new ArrayList<>();

    public Customer(String n) {
        super(n);
    }

    public Customer(String n, ArrayList l) {
        super(n);
        rList = l;
    }

    public void addToList(Resource r) {
        rList.add(r);
    }

    public void removeFromList(Resource r) {
        rList.remove(r);
    }

    public void emptyList() {
        rList.clear();
    }

    public String toString() {
        return name + ": " + userID + "; ";
    }
}
