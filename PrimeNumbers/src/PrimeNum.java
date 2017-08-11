import java.lang.Math;
/**
 * Created by Administrator on 07/08/2017.
 */
public class PrimeNum {


    /*public static int printPrimeNums() {
        int c = 4;
        int count = 0;

        for(int i = 9; i < 100; i = (i + 2)) {
            boolean done = false;
            if((i % 3 != 0) || (i % 5 != 0) || (i % 7 != 0) || (i % 9 != 0)) {
                int sq = (int) Math.sqrt(i);
                for (int j = 1; j <= sq; j = (j + 2)) {

                    if(i % j != 0 && done == false) {
                        count++;
                        System.out.println(i);
                        done = true;
                        break;
                    }
                }
                if(count > 2) {
                    c++;
                }
            }
        }
        System.out.println("");
        return c;
    }*/

    /*public static int printPrimeNums() {
        int c = 4;

        for(int i = 9; i < 100; i = (i + 2)) {
            boolean done = false;
            if((i % 3 != 0) || (i % 5 != 0) || (i % 7 != 0) || (i % 9 != 0)) {
                int sq = (int) Math.sqrt(i);
                for (int j = 1; j <= sq; j = (j + 2)) {
                    if(i % j != 0 && done == false) {
                        System.out.println(i);
                        c++;
                        done = true;
                    }
                }
            }
        }
        System.out.println("");
        return c;
    }*/

    /*public static int printPrimes() {
        int c = 0;
        for(int i = 2; i <= 100; i++) {
            int sq = (int) Math.sqrt(i);
            for(int j = 1; j <= sq; j++) {
                if(i % j != 0 && i != j) {
                    c++;
                    System.out.println(i);
                    break;
                }
            }
        }
        System.out.println("");
        return c;
    }*/

    public static void primes() {
        int n = 1000;
        int m = n + 1;
        boolean prime[m];
    }


    public static void main(String[] args) {
        //System.out.println("");
        //System.out.println("PrintPrimeNums:");
        //System.out.println(printPrimeNums());
        //System.out.println("");
        //System.out.println("PrintPrimes:");
        //System.out.println(printPrimes());
        System.out.println(primes());
    }
}
