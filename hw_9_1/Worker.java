package hw_9_1;

public class Worker extends Employee {
    
    @Override
    public double getSalary() {
        return getBaseSalary();
    }
}
