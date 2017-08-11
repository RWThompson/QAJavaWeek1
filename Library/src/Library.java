import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Administrator on 10/08/2017.
 */
public class Library implements SearchSort{

    ArrayList<Person> pList;
    ArrayList<Resource> rList;

    public Library() {
        ArrayList<Person> pList = new ArrayList<>();
        ArrayList<Resource> rList = new ArrayList<>();
    }

    public void checkResourceOut(Resource r) {
        int rID = r.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            if(rID == rList.get(i).getResourceID()) {
                rList.get(i).setAvailable(false);
            }
        }
    }

    public void checkResourceIn(Resource r) {
        int rID = r.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            if(rID == rList.get(i).getResourceID()) {
                rList.get(i).setAvailable(true);
            }
        }
    }

    public void addResource(Resource r) {
        rList.add(r);
    }

    public void removeResource(Resource r) {
        int rID = r.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            if(rID == rList.get(i).getResourceID()) {
                rList.remove(i);
            }
        }
    }

    public void updateResource(Book b, String name, String author, boolean isAvailable, String genre, int pages, String pub, String isbn) {
        int bID = b.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            String c = String.valueOf(b.getClass());
            if(bID == rList.get(i).getResourceID() && c == "Book") {
                rList.get(i).setAvailable(isAvailable);
                rList.get(i).setAuthor(author);
                rList.get(i).setName(name);
                ((Book) rList.get(i)).setGenre(genre);
                ((Book) rList.get(i)).setNumPages(pages);
                ((Book) rList.get(i)).setPublisher(pub);
                ((Book) rList.get(i)).setIsbn(isbn);
            }
        }
    }

    public void updateResource(Dissertation d, String name, String author, boolean isAvailable, int percentage, boolean codePresent) {
        int dID = d.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            String c = String.valueOf(d.getClass());
            if(dID == rList.get(i).getResourceID() && c == "Dissertation") {
                rList.get(i).setAvailable(isAvailable);
                rList.get(i).setAuthor(author);
                rList.get(i).setName(name);
                ((Dissertation) rList.get(i)).setPercentage(percentage);
                ((Dissertation) rList.get(i)).setCodePresent(codePresent);
            }
        }
    }

    public void updateResource(Journal j, String name, String author, boolean isAvailable, int issue) {
        int jID = j.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            String c = String.valueOf(j.getClass());
            if(jID == rList.get(i).getResourceID() && c == "Journal") {
                rList.get(i).setAvailable(isAvailable);
                rList.get(i).setAuthor(author);
                rList.get(i).setName(name);
                ((Journal) rList.get(i)).setIssueNum(issue);
            }
        }
    }

    public void registerPerson(Person p) {
        pList.add(p);
    }

    public void deletePerson(Person p) {
        int pID = p.getUserID();
        for(int i = 0; i < rList.size(); i++) {
            if(pID == pList.get(i).getUserID()) {
                pList.remove(i);
            }
        }
    }

    public void updatePerson(Customer c, ArrayList list, String name) {
        int cID = c.getUserID();
        for(int i = 0; i < pList.size(); i++) {
            String cl = String.valueOf(c.getClass());
            if(cID == pList.get(i).getUserID() && cl == "Customer") {
                pList.get(i).setName(name);
                for(int j = 0; j < list.size(); j++) {
                    ((Customer) pList.get(i)).addToList((Resource) list.get(j));
                }
            }

        }
    }

    public void updatePerson(Employee e, String name, String jt) {
        int eID = e.getUserID();
        for(int i = 0; i < pList.size(); i++) {
            String c = String.valueOf(e.getClass());
            if(eID == pList.get(i).getUserID() && c == "Employee") {
                pList.get(i).setName(name);
                ((Employee) pList.get(i)).setJobTitle(jt);
            }
        }
    }

    public void writeToFileResource(ArrayList list) {
        File file = new File("Resources.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();

                BufferedWriter w = new BufferedWriter(new FileWriter(file));
                for(int i = 0; i < list.size(); i++) {
                    String s = list.get(i).toString();
                    w.write(s);
                    w.newLine();
                }
                w.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void readFromFileResource() {

    }

    public void writeToFilePerson(ArrayList list) {

    }

    public void readFromFilePerson() {

    }

    @Override
    public String binarySearch(ArrayList list, String name) {
        return null;
    }

    @Override
    public ArrayList bubbleSort(ArrayList list) {
        return null;
    }
}
