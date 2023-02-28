package com.testingspace.first.data.repositories;

import com.testingspace.first.data.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
