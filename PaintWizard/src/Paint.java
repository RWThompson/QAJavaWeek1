/**
 * Created by Administrator on 08/08/2017.
 */
public class Paint {

    private String name;
    private double price;
    private int litres;
    private int m2; //metres ^ 2 per litre
    private int totalWasted;
    private double cheap;

    public Paint(String n, double p, int m) {
        name = n;
        price = p;
        m2 = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getTotalWasted() {
        return totalWasted;
    }

    public void setTotalWasted(int totalWasted) {
        this.totalWasted = totalWasted;
    }

    public double getCheap() {
        return cheap;
    }

    public void setCheap(double cheap) {
        this.cheap = cheap;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }
}
