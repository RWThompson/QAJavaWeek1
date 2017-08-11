/**
 * Created by Administrator on 08/08/2017.
 */
public class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public Motorcycle(String man, String mod, String c, int n, boolean on, boolean sc, int i, String t) {
        manufacturer = man;
        model = mod;
        colour = c;
        numWheels = n;
        isOn = on;
        hasSideCar = sc;
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

    public boolean getHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
}
