package hw_8_2;

import hw_8_1.Month;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private int salaryPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(Month[] monthArray) {
        int totalSalary = 0;
        for(int i = 0; i < monthArray.length; i++) {
            totalSalary += monthArray[i].getWorkingDays() * salaryPerDay;
        }
        return totalSalary;
    }
}
