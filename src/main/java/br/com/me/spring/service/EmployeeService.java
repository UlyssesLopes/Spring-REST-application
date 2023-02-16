package br.com.me.spring.service;

import br.com.me.spring.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee saveEmployee (Employee employee);

    Employee getSingleEmployee (Long id);

    void deleteEmployee (Long id);

    Employee updateEmployee (Employee employee);

    List<Employee> getEmployeesByName(String name);

    List<Employee> getEmployeesByNameAndLocation(String name, String location);

    List<Employee> getEmployeesByKeyword(String name);

    List<Employee> getEmployeesByAge(Long age);

}
