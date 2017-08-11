/**
 * Created by Administrator on 10/08/2017.
 */
public class Resource{

    public String name;
    public String author;
    public boolean isAvailable;
    public static int temp = 0;
    public String resourceID = "R";

    public Resource(String n, String a, boolean b) {
        name = n;
        author = a;
        isAvailable = b;
        resourceID += temp;
        temp++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getResourceID() {
        return resourceID;
    }
}
