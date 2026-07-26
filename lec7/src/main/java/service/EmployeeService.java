package service;

import model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    List<Employee> getEmployeesByIds(List<Long> ids);
    Employee addEmployee(Employee employee);
    List<Employee> addEmployees(List<Employee> employees);
    Employee modifyEmployee(Employee employee);
    List<Employee> modifyEmployees(List<Employee> employees);
    void deleteAllEmployees();
    void deleteEmployee(Long id);
    void deleteEmployeesById(List<Long> ids);
    List<Employee> getEmployeeByName(String name);
}
