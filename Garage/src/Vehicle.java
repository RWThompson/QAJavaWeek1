/**
 * Created by Administrator on 08/08/2017.
 */
public abstract class Vehicle {

    public String manufacturer;
    public String model;
    public String colour;
    public int numWheels;
    public boolean isOn;
    public int speed;
    public double price;
    public int id;
    public String type;

    public abstract void start();
    public abstract void accelerate();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String m) {
        manufacturer = m;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String m) {
        model = m;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String c) {
        colour = c;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int n) {
        numWheels = n;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean b) {
        isOn = b;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        type = t;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + ", Model: " + model + ", Colour: " + colour;
    }
}
