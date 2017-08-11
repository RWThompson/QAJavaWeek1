import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */
public class Controller {



    public static void main(String[] args) {
        ArrayList<Paint> list = new ArrayList();
        Paint p = new Paint("CheapoMax", 19.99, 10);
        list.add(p);
        Paint p1 = new Paint("AverageJoes", 17.99, 11);
        list.add(p1);
        Paint p2 = new Paint("DuluxourousPaints", 25, 20);
        list.add(p2);

        PaintWizard pw = new PaintWizard(6, 10, 30);
        pw.insertArrList(list);

        System.out.println("");
        System.out.println("=====CALCULATE CHEAPEST=====");
        int sqm = pw.calcSqMetre(6, 10, 30);
        int ln = pw.litresNeeded(sqm, list);

        System.out.println("");
        System.out.println("=====WHICH WASTES THE LEAST=====");
        int w = pw.wastesLeast(sqm, list);
        ArrayList<Paint> waste = new ArrayList();
        waste = pw.bubbleSortList();
        System.out.println(waste.get(0).getName() + "will waste the" +
                "least, wasting only " + waste.get(0).getTotalWasted()
                 + " litres");


        System.out.println("");
        System.out.println("=====CHEAPEST FOR ANY ROOM=====");
        pw.findCheapest(list);
        ArrayList<Paint> cheap = new ArrayList();
        cheap = pw.bubbleSortCheap();
        System.out.println(cheap.get(0).getName() + " will be the " +
                "cheapest for any room");
    }
}
