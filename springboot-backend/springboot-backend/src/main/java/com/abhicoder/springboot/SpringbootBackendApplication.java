package com.abhicoder.springboot;

import com.abhicoder.springboot.model.Employee;
import com.abhicoder.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Ramesh");
		employee.setLastName("Banefuller");
		employee.setEmailId("ramesh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstName("Suresh");
    	employee1.setLastName("Paprika");
		employee1.setEmailId("suresh@gmail.com");
		employeeRepository.save(employee1);
	}
}
