package task_inheritance;

public class Employee extends Person {
    private double salary;
    private String company;

    public Employee(String name, double salary, String company) {
        super(name);
        this.salary = salary;
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }
}