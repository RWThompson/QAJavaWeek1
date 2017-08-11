/**
 * Created by Administrator on 08/08/2017.
 */
public class Controller {

    public static void main(String[] args) {
        Garage g = new Garage();

        System.out.println("=====ADD VEHICLES=====");
        Vehicle v = new Bus("Volvo", "SF100", "White", 8, false, 64, 0, "Bus");
        g.addVehicle(v);
        Vehicle v1 = new Car("Ford", "LX", "Black", 4, false, 5, 1, "Car");
        g.addVehicle(v1);
        Vehicle v2 = new Motorcycle("Honda", "HO156", "Red", 2, true, false, 2, "Motorcycle");
        g.addVehicle(v2);
        Vehicle v3 = new Car("Mitsubishi", "Colt", "White", 4, false, 5, 3, "Car");
        g.addVehicle(v3);
        g.printGarage();
        System.out.println("");

        System.out.println("=====CALCULATE BILL=====");
        int b = 1;
        System.out.println("Bill for vehicle: " + b + " is " + g.calcBill(b));
        System.out.println("");
        g.printGarage();
        System.out.println("");

        System.out.println("=====REMOVE VEHICLE BY ID=====");
        g.removeVehicleInd(0);
        g.printGarage();
        System.out.println("");

        System.out.println("=====REMOVE ALL CARS=====");
        g.removeVehicleType("Car");
        g.printGarage();
        System.out.println("");

        System.out.println("=====EMPTY GARAGE=====");
        g.emptyGarage();
        g.printGarage();
        System.out.println("");
    }
}
