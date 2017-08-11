/**
 * Created by Administrator on 09/08/2017.
 */
public class UniqueSum {

    public int sumUnique(int a, int b, int c) {
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
}
