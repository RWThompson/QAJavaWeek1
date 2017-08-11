/**
 * Created by Administrator on 10/08/2017.
 */
public class Journal extends Resource{

    private int issueNum;

    public Journal(String n, String a, boolean b) {
        super(n, a, b);
    }

    public Journal(String n, String a, boolean b, int i) {
        super(n, a, b);
        issueNum = i;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
}
