package hw_8_1;

public class Month {
    
    private String month;
    private int daysInMonth;
    private int workingDays;
    
    Month(String month, int daysInMonth, int workingDays) {
        this.month = month;
        this.daysInMonth = daysInMonth;
        this.workingDays = workingDays;
    }

    public String getMonth() {
        return month;
    }
    
    public int getDaysInMonth() {
        return daysInMonth;
    }
    
    public int getWorkingDays() {
        return workingDays;
    }
}
