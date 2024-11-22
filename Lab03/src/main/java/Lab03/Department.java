package Lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department implements DepartmentManagement{

    private String departmentName;

    private int amountOfEmployees;

    private List<Employee> employees = new ArrayList<>();

    public Department(String departmentName, int amountOfEmployees) {
        this.departmentName = departmentName;
        this.amountOfEmployees = amountOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getAmountOfEmployees() {
        return amountOfEmployees;
    }

    public void setAmountOfEmployees(int amountOfEmployees) {
        this.amountOfEmployees = amountOfEmployees;
    }


    @Override
    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
            amountOfEmployees++;
            System.out.println("Employee added: " + employee.getName());
        }

    }

    @Override
    public void removeEmployee(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            amountOfEmployees--;
            System.out.println("Employee " + employee.getName() + " removed");
        }else{
            System.out.println("Employee " + employee.getName() + " not found");
        }
    }

    @Override
    public List<Employee> getEmployeesList() {
        return new ArrayList<>(employees);
    }

    @Override
    public String displayDepartmentDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department details: " + departmentName + "\n");
        sb.append("Number of employees: " + amountOfEmployees + "\n");
        sb.append("Employee details:\n");
        for (Employee employee : employees) {
            sb.append(employee.getInfoAboutEmployee());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return displayDepartmentDetails();
    }
}
