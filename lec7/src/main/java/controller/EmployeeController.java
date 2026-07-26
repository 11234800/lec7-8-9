package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/by-ids")
    public List<Employee> getEmployeesByIds(@RequestParam List<Long> ids) {
        return employeeService.getEmployeesByIds(ids);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/employees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return employeeService.addEmployees(employees);
    }

    @PutMapping("/employee")
    public Employee modifyEmployee(@RequestBody Employee employee) {
        return employeeService.modifyEmployee(employee);
    }

    @PutMapping("/employees")
    public List<Employee> modifyEmployees(@RequestBody List<Employee> employees) {
        return employeeService.modifyEmployees(employees);
    }

    @DeleteMapping("/employees")
    public void deleteAllEmployees() {
        employeeService.deleteAllEmployees();
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @DeleteMapping("/employeesById")
    public void deleteEmployeesById(@RequestParam List<Long> ids) {
        employeeService.deleteEmployeesById(ids);
    }

    @GetMapping("/employee/name")
    public List<Employee> getEmployeeByName(@RequestParam String name) {
        return employeeService.getEmployeeByName(name);
    }
}
