package io.ankithjain.service;

import io.ankithjain.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findOne(String id);

    Employee create(Employee emp);

    Employee update(String id, Employee emp);

    void delete(String id);
}