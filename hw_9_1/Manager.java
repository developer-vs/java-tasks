package hw_9_1;

public class Manager {
    
    private Employee employee = new Employee();

    private int  numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    
    public int getSalary() {
        if(numberOfSubordinates == 0) {
            return employee.getBaseSalary();
        }
        return employee.getBaseSalary() * (numberOfSubordinates / 100 * 3);
    }

    /*
        в классе, метод getSalary будет возвращать значение по формуле
         - <базовая ставка> * (<количество подчиненных> / 100 * 3).
         Если количество подчиненных 0, то результат как у обычного рабочего.
     */

}
