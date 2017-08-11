import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 09/08/2017.
 */
public class Person {

    private String name;
    private String occupation;
    private int age;

    public Person(String name, String occupation, int age) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ", " + occupation + ", " + age;
    }

    public void printPeople(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void writeToFile(ArrayList list) {
        try {
            File file = new File("PersonJava.txt");
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

    public void readFromFile() {
     //   ArrayList<String> sList = new ArrayList();
        ArrayList<Person> personList = new ArrayList<Person>();
        String file = "PersonJava.txt";
        String sCurLine;
    //    String[][] s = new String[5][3];
        try {
            BufferedReader b = new BufferedReader(new FileReader(file));
            while((sCurLine = b.readLine()) != null) {
              //  sList.add(sCurLine);
//                for(int i = 0; i < sList.size(); i++) {
//                    for (int j = 0; j < 3; j++) {
//                        String temp = sList.get(i);
//                        s[j] = (temp.split(", "));
//                    }
                String[] personData = sCurLine.split(", ");
                    Person p = new Person(personData[0], personData[1], (Integer.parseInt(personData[2])));
                personList.add(p);
//
//      System.out.println(p.toString());
             //   }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(int i = 0; i < sList.size(); i++) {
//            System.out.println(sList.get(i).toString());
//        }

        personList.forEach( p -> System.out.println(p));
      //  return null;
    //    return sList;
    }
}
