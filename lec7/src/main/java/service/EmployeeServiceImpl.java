package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public List<Employee> getEmployeesByIds(List<Long> ids) {
        return employeeRepo.findAllById(ids);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> addEmployees(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    @Override
    public Employee modifyEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> modifyEmployees(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    @Override
    public void deleteAllEmployees() {
        employeeRepo.deleteAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public void deleteEmployeesById(List<Long> ids) {
        employeeRepo.deleteAllById(ids);
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepo.findByNameStartingWith(name);
    }
}
