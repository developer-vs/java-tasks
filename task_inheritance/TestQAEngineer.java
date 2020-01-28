package task_inheritance;

public class TestQAEngineer {
    public static void main(String[] args) {
        // display a QA Engineer name, salary, company, and signin bonus
        QAEngineer qaEngineer = new QAEngineer("John", 120000, "Some Company", 10000);
        System.out.println(
                            "Name: " + qaEngineer.getName() +
                            "\nSalary: " + qaEngineer.getSalary() +
                            "\nCompany name: " + qaEngineer.getCompany() +
                            "\nSign In bonus: " + qaEngineer.getSignInBonus()
        );
    }
}