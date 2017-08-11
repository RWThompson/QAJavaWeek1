/**
 * Created by Administrator on 08/08/2017.
 */
public class Car extends Vehicle {

    private int numDoors;

    public Car(String man, String mod, String c, int n, boolean on, int d, int i, String t) {
        manufacturer = man;
        model = mod;
        colour = c;
        numWheels = n;
        isOn = on;
        numDoors = d;
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

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
