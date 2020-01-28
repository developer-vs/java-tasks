public class TestQAEngineer {
    public static void main(String[] args) {
        // display a QA Engineer name, salary, company, and signin bonus
        QAEngineer qaEngineer = new QAEngineer("John", 120000, "Company", 10000);
        System.out.println("Name: " + qaEngineer.getName() + "salary: " + qaEngineer.getSalary() + "company: " + qaEngineer.getCompany() + "signin bonus: " + qaEngineer.getSignInBonus());
    }
}