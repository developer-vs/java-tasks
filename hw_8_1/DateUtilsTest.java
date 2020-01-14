package hw_8_1;

public class DateUtilsTest {

    public static void main(String[] args) {
        ;
        for(int i = 0; i < DateUtils.getMonths().length; i++) {
            System.out.println("month: " + DateUtils.getMonths()[i].getMonth() +
                ", days: " + DateUtils.getMonths()[i].getDaysInMonth() +
                ", working days: " + DateUtils.getMonths()[i].getWorkingDays());
        }
    }
}
