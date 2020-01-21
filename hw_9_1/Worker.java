package hw_9_1;

public class Worker {
    
    private Employee employee = new Employee();

    public Worker(int baseSalary, String name) {
        employee.setBaseSalary(baseSalary);
        employee.setName(name);
    }

    public double getSalary() {
        return employee.getBaseSalary();
    }
}
