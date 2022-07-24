package constructors;
/*
ask 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary; // instance variable, belongs to object

    public static String companyName; // static field, belongs to class

    static {
        companyName ="Microsoft";
    }

    public Employee() {
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }
}
