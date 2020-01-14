package hw_8_1;

public class DateUtils {

    private static final Month[] MONTHS = {
        new Month("January", 31, 23),
        new Month("February", 28, 20),
        new Month("March", 31, 22),
        new Month("April", 30, 22),
        new Month("May", 31, 22),
        new Month("June", 30, 22),
        new Month("July", 31, 23),
        new Month("August", 31, 21),
        new Month("September", 30, 22),
        new Month("October", 31, 22),
        new Month("November", 30, 21),
        new Month("December", 31, 23)
    };
    
    public static Month[] getMonths() {
        return MONTHS;
    }
}
