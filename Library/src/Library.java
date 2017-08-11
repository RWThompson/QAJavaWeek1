import java.io.*;
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
        String rID = r.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            if(rID == rList.get(i).getResourceID()) {
                rList.get(i).setAvailable(false);
            }
        }
    }

    public void checkResourceIn(Resource r) {
        String rID = r.getResourceID();
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
        String rID = r.getResourceID();
        for(int i = 0; i < rList.size(); i++) {
            if(rID == rList.get(i).getResourceID()) {
                rList.remove(i);
            }
        }
    }

    public void updateResource(Book b, String name, String author, boolean isAvailable, String genre, int pages, String pub, String isbn) {
        String bID = b.getResourceID();
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
        String dID = d.getResourceID();
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
        String jID = j.getResourceID();
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
        String pID = p.getUserID();
        for(int i = 0; i < rList.size(); i++) {
            if(pID == pList.get(i).getUserID()) {
                pList.remove(i);
            }
        }
    }

    public void updatePerson(Customer c, ArrayList list, String name) {
        String cID = c.getUserID();
        for(int i = 0; i < pList.size(); i++) {
            String cl = String.valueOf(c.getClass());
            if(cID == pList.get(i).getUserID() && cl == "Customer") {
                pList.get(i).setName(name);
                for(int j = 0; j < list.size(); j++) {
                    ((Customer) pList.get(i)).addToList((String) list.get(j));
                }
            }

        }
    }

    public void updatePerson(Employee e, String name, String jt) {
        String eID = e.getUserID();
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
        String file = "Resources.txt";
        String sCurLine;
        boolean temp;
        boolean temp2;
        try {
            BufferedReader b = new BufferedReader(new FileReader(file));
            while((sCurLine = b.readLine()) != null) {
                String[] resourceData = sCurLine.split(", ");
                if(resourceData[0] == "Book") {
                    if(resourceData[3] == "true") {
                        temp = true;
                    } else {
                        temp = false;
                    }
                    Resource re = new Book(resourceData[1], resourceData[2], temp, resourceData[4], (Integer.parseInt(resourceData[5])), resourceData[6], resourceData[7]) ;
                    rList.add(re);
                } else if(resourceData[0] == "Dissertation") {
                    if(resourceData[3] == "true") {
                        temp = true;
                    } else {
                        temp = false;
                    }
                    if(resourceData[5] == "true") {
                        temp2 = true;
                    } else {
                        temp2 = false;
                    }
                    Resource re = new Dissertation(resourceData[1], resourceData[2], temp, (Integer.parseInt(resourceData[4])), temp2);
                    rList.add(re);
                } else if(resourceData[0] == "Journal") {
                    if(resourceData[3] == "true") {
                        temp = true;
                    } else {
                        temp = false;
                    }
                    Resource re = new Journal(resourceData[1], resourceData[2], temp, (Integer.parseInt(resourceData[4])));
                    rList.add(re);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFilePerson(ArrayList list) {
        File file = new File("People.txt");
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

    public void readFromFilePerson() {
        String file = "People.txt";
        String sCurLine;
        try {
            BufferedReader b = new BufferedReader(new FileReader(file));
            while ((sCurLine = b.readLine()) != null) {
                String[] personData = sCurLine.split(", ");
                if (personData[0] == "Customer") {
                    ArrayList<String> re = new ArrayList<>();
                    for(int i = 0; i < personData.length; i++) {
                        if(personData[i].charAt(0) == 'R') {
                            re.add(personData[i]);
                        }
                    }
                    Person pe = new Customer(personData[1], re);
                    pList.add(pe);
                } else if (personData[0] == "Employee") {
                    Person pe = new Employee(personData[1], personData[2]);
                    pList.add(pe);
                }
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

        @Override
    public String binarySearch(ArrayList list, String name) {
//        int a = 0;
//        int b = list.size() - 1;
//        int c;
//        String res = "";
//
//        while (a <= b) {
//            c = (a + b) / 2;
//            if(list.get(c).getClass().getName().compareTo(name) < 0) {
//                a = c + 1;
//            } else if(list.get(c).getClass().getName().compareTo(name) > 0) {
//                b = c - 1;
//            }
//        }
//

        return null;
    }


    @Override
    public ArrayList bubbleSort(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                String c = String.valueOf(list.get(j).getClass());
                if(c == "Person") {
                    Person p;
                    if((list.get(j).getClass().getName()).compareTo(list.get(i).getClass().getName()) < 0) {
                        p = (Person) list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, p);
                    }
                } else if(c == "Resource") {
                    Resource r;
                    if((list.get(j).getClass().getName()).compareTo(list.get(i).getClass().getName()) < 0) {
                        r = (Resource) list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, r);
                    }
                }
            }
        }
        return null;
    }
}
