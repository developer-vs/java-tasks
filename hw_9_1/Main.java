package hw_9_1;

public class Main {

    public static void main(String[] args) {
        Worker john = new Worker(5000, "John");
        System.out.println(john.getSalary());
        
        Manager manager = new Manager();
        manager.getSalary();
    }
}