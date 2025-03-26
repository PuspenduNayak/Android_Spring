package com.puspenduNayak.springServer.repository;

import com.puspenduNayak.springServer.model.employee.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
