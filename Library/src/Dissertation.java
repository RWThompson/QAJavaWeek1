/**
 * Created by Administrator on 10/08/2017.
 */
public class Dissertation extends Resource{

    private int percentage;
    private boolean codePresent;

    public Dissertation(String n, String a, boolean b) {
        super(n, a, b);
    }

    public Dissertation(String n, String a, boolean b, int p, boolean cp) {
        super(n, a, b);
        percentage = p;
        codePresent = cp;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public boolean isCodePresent() {
        return codePresent;
    }

    public void setCodePresent(boolean codePresent) {
        this.codePresent = codePresent;
    }

    public String toString() {
        return "Dissertation, " + name + ", " + author + ", " + isAvailable + ", " + percentage + ", " + codePresent;
    }
}
