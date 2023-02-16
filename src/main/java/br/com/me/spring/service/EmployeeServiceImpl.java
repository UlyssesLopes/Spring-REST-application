package br.com.me.spring.service;

import br.com.me.spring.model.Employee;
import br.com.me.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository eRepository;

    @Override
    public List<Employee> getEmployees() {
        return eRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return eRepository.save(employee);
    }

    public Employee getSingleEmployee(Long id) {
        Optional<Employee> employee = eRepository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id " + id);
    }

    @Override
    public void deleteEmployee(Long id) {
        eRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return eRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return eRepository.findByName(name);
    }

    @Override
    public List<Employee> getEmployeesByNameAndLocation(String name, String location) {
        return  eRepository.findByNameAndLocation(name, location);
    }

    @Override
    public List<Employee> getEmployeesByKeyword(String name) {
        return eRepository.findByNameContaining(name);
    }

    @Override
    public List<Employee> getEmployeesByAge(Long age) {
        return eRepository.findByAge(age);
    }
}
