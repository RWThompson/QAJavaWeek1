/**
 * Created by Administrator on 09/08/2017.
 */
public class TooHot {

    public boolean tooHot(int t, boolean b) {
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
}
