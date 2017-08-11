import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Person {
    private String name;
    private int age;
    private String jobTitle;

    public Person(String n, int a, String j) {
        name = n;
        age = a;
        jobTitle = j;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + jobTitle;
    }
}
