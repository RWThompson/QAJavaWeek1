import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */
public class Garage {

    ArrayList<Vehicle> list;

    public Garage() {
        list = new ArrayList<Vehicle>();
    }

    public double calcBill(int id) {
        double bill = 0;
        for(Vehicle v : list) {
            if(v instanceof Bus && id == v.getID()) {
                bill = v.getPrice() / ((Bus) v).getPasLimit();
                bill = bill + 150;
            } else if(v instanceof Car && id == v.getID()) {
                bill = v.getPrice() * (((Car) v).getNumDoors() * 10000);
                bill = bill + 100;
            } else if(v instanceof Motorcycle && id == v.getID()) {
                if(((Motorcycle) v).getHasSideCar()) {
                    bill = v.getPrice() / 100;
                    bill = bill + 60;
                } else {
                    bill = v.getPrice() / 100;
                    bill = bill + 75;
                }
            }
        }
        return bill;
    }

    public void addVehicle(Vehicle v) {
        list.add(v);
    }

    public void removeVehicleObj(Vehicle v) {
        list.remove(v);
    }

    public void removeVehicleInd(int i) {
        for(int j = 0; j < list.size(); j++) {
            if (list.get(j).getID() == i) {
                list.remove(j);
            }
        }
    }

    public void removeVehicleType(String ve) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Bus && ve.equalsIgnoreCase("Bus")) {
                list.remove(list.get(i));
            } else if(list.get(i) instanceof Car && ve.equalsIgnoreCase("Car")) {
                list.remove(list.get(i));
            } else if(list.get(i) instanceof Motorcycle && ve.equalsIgnoreCase("Motorcycle")) {
                list.remove(list.get(i));
            }

        }
    }

    public void emptyGarage() {
        list.clear();
    }

    public void printGarage() {
        for(Vehicle v : list) {
            System.out.println(v.toString());
        }
    }
}
