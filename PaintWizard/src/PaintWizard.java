import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */
public class PaintWizard {

    private int height;
    private int length1;
    private int length2;
    //private int[] arr;
    private Paint pai;

    private ArrayList<Paint> l = new ArrayList();

    public PaintWizard(int h, int l, int l2) {
        height = h;
        length1 = l;
        length2 = l2;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int calcSqMetre(int h, int l, int l2) {
        int r = 0;
        int temp = (h * l) * 2;
        int temp2 = (h * l2) * 2;
        r = temp + temp2;
        return r;
    }

    public int litresNeeded(int total, ArrayList<Paint> list) {
        int res = 0;
        for(Paint p : list) {
            res = total / p.getM2();
            System.out.println(p.getName() + "Tub of " + p.getLitres() +
                " litres, you will need " + res + " litres");
        }
        if(res > 15) {
            System.out.println("CheapoMax will be the cheapest");
        } else {
            System.out.println("AverageJoes will be the cheapest");
        }
        return res;
    }

    public int wastesLeast(int total, ArrayList<Paint> list) {
        int res = 0;
        for(Paint pai : list) {
            if(total > pai.getM2()) {
                total = total + pai.getM2();
            } else {
                pai.setTotalWasted(total);
            }

        }
        return res;
    }

    /*public int bubbleSort() {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }*/

    public ArrayList bubbleSortList() {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < l.size(); j++) {
                if((l.get(j).getTotalWasted() > (l.get(i).getTotalWasted()))) {
                    Paint temp = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, temp);
                }
            }
        }
        return l;
    }

    public void insertArrList(ArrayList<Paint> list) {
        for(Paint p : list) {
            l.add(p);
        }
    }

    public void findCheapest(ArrayList<Paint> list) {
        for(Paint pa : list) {
            if(pa.getName().equalsIgnoreCase("CheapoMax")) {
                pa.setCheap((pa.getPrice() * 3) / 10);
            } else if (pa.getName().equalsIgnoreCase("AverageJoes")) {
                pa.setCheap((pa.getPrice() * 4) / 11);
            } else if (pa.getName().equalsIgnoreCase("DuluxourousPaints")) {
                pa.setCheap((pa.getPrice() * 6) / 20);
            }
        }
    }

    public ArrayList bubbleSortCheap() {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < l.size(); j++) {
                if((l.get(j).getCheap() > (l.get(i).getCheap()))) {
                    Paint temp = l.get(i);
                    l.set(i, l.get(j));
                    l.set(j, temp);
                }
            }
        }
        return l;
    }
}
