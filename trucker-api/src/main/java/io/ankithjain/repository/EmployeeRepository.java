package io.ankithjain.repository;

import io.ankithjain.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
    Optional<Employee> findByEmail(String email);
}