/**
 * Created by Administrator on 08/08/2017.
 */
public class Bus extends Vehicle {

    private int pasLimit;

    public Bus(String man, String mod, String c, int n, boolean on, int p, int i, String t) {
        manufacturer = man;
        model = mod;
        colour = c;
        numWheels = n;
        isOn = on;
        pasLimit = p;
        id = i;
        type = t;
    }

    @Override
    public void start() {
        isOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed++;
    }

    public int getPasLimit() {
        return pasLimit;
    }

    public void setPasLimit(int pasLimit) {
        this.pasLimit = pasLimit;
    }
}
