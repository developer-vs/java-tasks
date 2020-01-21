package hw_9_1;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public Manager(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {

        if(numberOfSubordinates > 0) {
            return super.getSalary() * (double) (numberOfSubordinates / 100) * 3;
        }
        return super.getSalary();
    }
}
