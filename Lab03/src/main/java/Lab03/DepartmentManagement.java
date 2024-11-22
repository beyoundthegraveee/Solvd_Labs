package Lab03;

import java.util.List;

public interface DepartmentManagement {

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);

    List<Employee> getEmployeesList();

    String displayDepartmentDetails();



}
