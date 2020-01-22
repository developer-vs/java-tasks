package hw_9_1;

public class Director extends Manager{
    
    @Override
    public double getSalary() {
        if(getNumberOfSubordinates() > 0) {
            return getBaseSalary() * ((double)(getNumberOfSubordinates()) / 100 * 9);
        }
        return getBaseSalary();
    }
}
