package hw_8_3;

import hw_8_1.DateUtils;
import hw_8_1.Month;

public class ManagerTest {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setSalaryPerDay(55*8);

        Month[] monthsForSalary = {DateUtils.getMonths()[0], DateUtils.getMonths()[1]};
        System.out.println("Total salary: " + manager.getSalary(monthsForSalary));
    }
}
