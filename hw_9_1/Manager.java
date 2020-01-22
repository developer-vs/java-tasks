package hw_9_1;

public class Manager extends Worker {

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if(numberOfSubordinates > 0) {
            return getBaseSalary() * ((double)(numberOfSubordinates) / 100 * 3);
        }
        return getBaseSalary();
    }
}
