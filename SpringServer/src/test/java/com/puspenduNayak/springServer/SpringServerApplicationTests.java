package com.puspenduNayak.springServer;

import com.puspenduNayak.springServer.model.employee.Employee;
import com.puspenduNayak.springServer.service.EmployeeDao;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

	@Disabled
	@Test
	void addEmployeeTest() {
		Employee employee = new Employee();
		employee.setName("Ram");
		employee.setBranch("Sales");
		employee.setLocation("Mumbai");
		employeeDao.save(employee);
	}

	@Disabled
	@Test
	void getAllEmp(){
		List<Employee> allEmployee = employeeDao.getAllEmployee();
		for (Employee e: allEmployee){
			employeeDao.delete(e);
		}
	}

}
