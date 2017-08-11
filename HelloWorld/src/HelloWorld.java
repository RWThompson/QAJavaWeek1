import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2017.
 */
public class HelloWorld {

    static String s = "Hello World!";
    static int a = 3;
    static int b = 4;
    static int arr[] = {2,3,4,5,6,7,8,9,10,11};
    static int arra[] = new int[10];
    static ArrayList<People> people = new ArrayList<>();

    public static void printString(String s) {
        System.out.println(s);
    }

    public static String makeString() {
        String s = "Hello World!";
        return s;
    }

    public static int addInts(int a, int b, boolean op) {
        int c = 0;

        if(a == 0 || b == 0) {
            c = a + b;
        } else if(op) {
            c = a + b;
        } else {
            c = a * b;
        }
        return c;
    }

    public static void iterate() {
        for(int i = 0; i < 10; i++) {
            System.out.println(addInts(i, b, true));
        }
    }

    public static void printArray(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void populateArray(int a[]) {
        for(int i = 0; i < 10; i++) {
            int b = i + 5;
            a[i] = b;
        }

        for(int i = 0; i < 10; i++) {
            a[i] = a[i] * 10;
            System.out.println(a[i]);
        }
    }

    public static int blackJack(int a, int b) {
        int c = 0;
        if(a > b && a <= 21) {
            c = a;
        } else if(b > a && b <=21) {
            c = b;
        } else {
            c = 0;
        }
        return c;
    }

    public static int sumUnique(int a, int b, int c) {
        int r = 0;
        if((a != b && a != c && b != c)) {
            r = r + a;
            r = r + b;
            r = r + c;
        } else if(a != b) {
            r = r + a;
        } else if(a != c) {
            r = r + c;
        } else if(b != c) {
            r = r + b;
        }
        return r;
    }

    public static boolean tooHot(int t, boolean b) {
        boolean r = false;
        if(b = true) {
            if(t >= 60 && t <= 100) {
                r = true;
            } else {
                r = false;
            }
        } else {
            if(t >= 60 && t <= 90) {
                r = true;
            } else {
                r = false;
            }
        }
        return r;
    }

    public static void createPeople() {
        People p = new People("Dean Winchester", 30, "Hunter");
        People p1 = new People("Sam Winchester", 25, "Hunter");
        People p2 = new People("Mike Ross", 25, "Lawyer");
        People p3 = new People("Harvey Specter", 32, "Lawyer");
        people.add(p);
        people.add(p1);
        people.add(p2);
        people.add(p3);
    }

    public static void printPeople() {
        for(People p : people) {
            System.out.println(p.toString());
        }
    }

    public static String findPerson(String n) {
        String r = "";
        for(People p : people) {
            if(p.getName().equals(n)) {
                r = p.toString();
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(s);
        printString(s);
        System.out.println(makeString());
        System.out.println(addInts(0,b,false));
        System.out.println("");
        iterate();
        System.out.println("");
        for(int i = 0; i < 10; i++) {
            System.out.println(addInts(arr[i], b, true));
        }
        System.out.println("");
        printArray(arr);
        System.out.println("");
        populateArray(arra);
        System.out.println("");
        System.out.println("Blackjack");
        System.out.println(blackJack(0,21));
        System.out.println("");
        System.out.println("Unique Sum");
        System.out.println(sumUnique(3,3,4));
        System.out.println("");
        System.out.println("Too Hot");
        System.out.println(tooHot(100, true));
        System.out.println("");
        System.out.println("People");
        createPeople();
        printPeople();
        System.out.println("");
        System.out.println(findPerson("Mike Ross"));
    }
}
