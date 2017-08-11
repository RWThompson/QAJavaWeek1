/**
 * Created by Administrator on 07/08/2017.
 */
public class PrimeNum {

    public static void printPrimeNums() {
        for(int i = 2; i > 50; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            } else if (i % 3 == 0) {
                System.out.println(i);
            } else if (i % 5 == 0) {
                System.out.println(i);
            } else if (i % 7 == 0) {
                System.out.println(i);
            } else if (i % 9 == 0) {
                System.out.println(i);
            }
            System.out.println(", ");
        }
    }

    public static void main(String[] args) {
        printPrimeNums();
    }
}
