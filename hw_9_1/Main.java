package hw_9_1;

public class Main {

    public static void main(String[] args) {
        Worker john = new Worker();
        john.setBaseSalary(45000);
        john.setName("John");
        System.out.println("Worker name: " + john.getName() + ", salary: " + john.getSalary());

        Manager kevin = new Manager();
        kevin.setNumberOfSubordinates(0);
        kevin.setBaseSalary(50000);
        kevin.setName("Kevin");
        System.out.println("Manager name: " + kevin.getName() + ", salary: " + kevin.getSalary());
        
        Director tom = new Director();
        tom.setNumberOfSubordinates(0);
        tom.setBaseSalary(60000);
        tom.setName("Tom");
        System.out.println("Director name: " + tom.getName() + ", salary: " + tom.getSalary());
    }
}
