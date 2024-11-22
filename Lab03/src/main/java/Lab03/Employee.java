package Lab03;

import java.util.Objects;

public abstract class Employee extends Person {

    protected String employeeId;

    protected String profession;

    protected EmployeeStatus status;

    protected Department department;

    protected abstract String getInfoAboutEmployee();


    public Employee(String name, String surname, int age, String employeeId, String profession, EmployeeStatus status, Department department) {
        super(name, surname, age);
        this.employeeId = employeeId;
        this.profession = profession;
        this.status = status;
        this.department = department;
    }



    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(profession, employee.profession) && status == employee.status && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, profession, status, department);
    }


}
