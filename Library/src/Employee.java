/**
 * Created by Administrator on 10/08/2017.
 */
public class Employee extends Person{

    String jobTitle;

    public Employee(String n) {
        super(n);
    }

    public Employee(String n, String jt) {
        super(n);
        jobTitle = jt;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee, " + name + ", " + userID + ", " + jobTitle;
    }
}
