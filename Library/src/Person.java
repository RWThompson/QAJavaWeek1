/**
 * Created by Administrator on 10/08/2017.
 */
public class Person{

    public static int temp = 0;
    public String userID = "P";
    public String name;

    public Person(String n) {
        name = n;
        userID += temp;
        temp++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }
}
