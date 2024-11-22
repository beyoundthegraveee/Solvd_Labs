package Lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Practitioner extends Employee{

    private int amountOfClasses;

    private ArrayList<Subject> subjects;

    private int yearsOfExperience;

    private String contactInfo;

    public Practitioner(String name, String surname, int age, String employeeId, String profession, EmployeeStatus status, Department department, int amountOfClasses, ArrayList<Subject> subjects, int yearsOfExperience, String contactInfo) {
        super(name, surname, age, employeeId, profession, status, department);
        this.amountOfClasses = amountOfClasses;
        this.subjects = subjects;
        this.yearsOfExperience = yearsOfExperience;
        this.contactInfo = contactInfo;
    }

    public int getAmountOfClasses() {
        return amountOfClasses;
    }

    public void setAmountOfClasses(int amountOfClasses) {
        this.amountOfClasses = amountOfClasses;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String getInfoAboutEmployee() {
        return "Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nAge: " + getAge() +
                "\nEmployee ID: " + getEmployeeId() +
                "\nProfession: " + getProfession() +
                "\nStatus: " + getStatus() +
                "\nYears of Experience: " + getYearsOfExperience() +
                "\nContact Info: " + getContactInfo() +
                "\nAmount of Classes: " + getAmountOfClasses() +
                "\nSubjects: " + subjects +
                "\n";

    }

    @Override
    public String toString() {
        return "Practitioner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Practitioner that)) return false;
        if (!super.equals(o)) return false;
        return amountOfClasses == that.amountOfClasses &&
                yearsOfExperience == that.yearsOfExperience &&
                Objects.equals(subjects, that.subjects) &&
                Objects.equals(contactInfo, that.contactInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),amountOfClasses, subjects, yearsOfExperience, contactInfo);
    }
}
