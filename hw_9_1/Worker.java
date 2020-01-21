package hw_9_1;

public class Worker {
    
    Employee employee = new Employee();

    public Worker(int baseSalary, String name) {
        employee.setBaseSalary(baseSalary);
        employee.setName(name);
    }
    
    public int getSalary() {
        return employee.getBaseSalary();
    }
}
