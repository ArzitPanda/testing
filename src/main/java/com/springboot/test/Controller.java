package com.springboot.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);  

	@GetMapping("/emp")
	public ResponseEntity<?> getEmployee() {
		Employee emp = new Employee();

		emp.setEmployeeName("Test Employee");
		emp.setEmployeeId("Emp001");
		emp.setEmployeeAddress("Rajasthan");
		
		logger.info("Employee details: emp[{}]",emp.getEmployeeId());
		
		System.out.println("empid"+emp.getEmployeeId());
		System.out.println("empname"+emp.getEmployeeName());
		System.out.println("empaddress"+emp.getEmployeeAddress());

		return new ResponseEntity<>(emp, HttpStatus.OK);

	}

}
