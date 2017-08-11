/**
 * Created by Administrator on 09/08/2017.
 */
public class BlackJack {

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
}
