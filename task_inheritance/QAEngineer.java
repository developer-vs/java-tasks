package task_inheritance;

public class QAEngineer extends Employee {
    private double signInBonus;

    public QAEngineer(String name, double salary, String company, double signInBonus) {
        super(name, salary, company);
        this.signInBonus = signInBonus;
    }

    public double getSignInBonus() {
        return signInBonus;
    }
}