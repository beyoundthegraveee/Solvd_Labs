package Lab03;

import java.util.Objects;

public class Professor extends Employee {

    private int yearsOfTeaching;

    private boolean tenured;

    private String academicDegree;

    public Professor(String name, String surname, int age, String employeeId, String profession, EmployeeStatus status, Department department, int yearsOfTeaching, boolean tenured, String academicDegree) {
        super(name, surname, age, employeeId, profession, status, department);
        this.yearsOfTeaching = yearsOfTeaching;
        this.tenured = tenured;
        this.academicDegree = academicDegree;
    }

    public Professor(String name, String surname, int age, String employeeId, String profession, EmployeeStatus status, Department department, boolean tenured) {
        super(name, surname, age, employeeId, profession, status, department);
        this.tenured = tenured;
    }

    public int getYearsOfTeaching() {
        return yearsOfTeaching;
    }

    public void setYearsOfTeaching(int yearsOfTeaching) {
        this.yearsOfTeaching = yearsOfTeaching;
    }

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String getInfoAboutEmployee() {
        return "Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nAge: " + getAge() +
                "\nEmployee ID: " + getEmployeeId() +
                "\nProfession: " + getProfession() +
                "\nStatus: " + getStatus() +
                "\nAcademic Degree: " + getAcademicDegree() +
                "\nYears of Teaching: " + getYearsOfTeaching() +
                 "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor professor)) return false;
        if (!super.equals(o)) return false;
        return yearsOfTeaching == professor.yearsOfTeaching &&
                tenured == professor.tenured &&
                Objects.equals(academicDegree, professor.academicDegree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),yearsOfTeaching, tenured, academicDegree);
    }
}
