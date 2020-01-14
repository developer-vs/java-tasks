package hw_8_2;

import hw_8_1.DateUtils;
import hw_8_1.Month;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalaryPerDay(45*8);

        Month[] monthsForSalary = {DateUtils.getMonths()[0], DateUtils.getMonths()[1]};
        System.out.println("Total salary: " + emp.getSalary(monthsForSalary));
    }
}
