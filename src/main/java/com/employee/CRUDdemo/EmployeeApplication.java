package com.employee.CRUDdemo;

import com.employee.CRUDdemo.dao.EmployeeDAO;
import com.employee.CRUDdemo.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@SpringBootApplication
public class EmployeeApplication {
	SimpleDateFormat format = new SimpleDateFormat( "dd/MM/yyyy" );
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

	}
	@Bean
	public CommandLineRunner commandLineRunner(EmployeeDAO employeeDAO){
		return runner ->{
			//createEmployee(employeeDAO);
			//readEmployee(employeeDAO);
			//getAllEmployees(employeeDAO);
			//queryForEmployeeByFirstName(employeeDAO);

			//updateEmployee(employeeDAO);
			//deleteEmployee(employeeDAO);
			deleteAllEmployees(employeeDAO);
		};
	}

	private void deleteAllEmployees(EmployeeDAO employeeDAO) {
		int numbersOfRowsDeleted= employeeDAO.deleteAllEmployee();
		System.out.println(numbersOfRowsDeleted);
	}

	private void deleteEmployee(EmployeeDAO employeeDAO) {
		int employeeId=4461;
		employeeDAO.delete(employeeId);

	}

	private void updateEmployee(EmployeeDAO employeeDAO) {
		//
		int idEmployee=1;
		//get employee based in id
		Employee theEmployee=employeeDAO.foundById(idEmployee);

		//change the first name
		theEmployee.setFirstName("Pedro");

		//update the employee
		employeeDAO.update(theEmployee);

		//display the updated employee
		System.out.println(theEmployee);

	}

	private void queryForEmployeeByFirstName(EmployeeDAO employeeDAO) {
		List<Employee> list=employeeDAO.findByFirstName("Hugo");

		for(Employee theEmployee: list){
			System.out.println(theEmployee);
		}
	}

	private void getAllEmployees(EmployeeDAO employeeDAO) {
		List<Employee> employees=employeeDAO.getAllEmployee();

		for(Employee theEmployee :employees){
			System.out.println(theEmployee);
		}
	}

	private void readEmployee(EmployeeDAO employeeDAO) throws ParseException {
		//Create the Employee
		Employee theEmployee =new Employee("Guilermo","Hugo","Baltazar","Sanchez","Soltero",format.parse("16/07/1980")
				,"Mexicana",0,"Familiar",1,1,"Nomina");

		//Save the employee

		employeeDAO.save(theEmployee);

		//Retrieve the id employee saved
		Integer theID=theEmployee.getPersonId();
		System.out.println("The employee id was saved "+theID);

		//get the id of employee
		Employee getEmployee=employeeDAO.foundById(theID);

		//Retrieve Employee data
		System.out.println("Data Employeee "+getEmployee);

	}

	private void createEmployee(EmployeeDAO employeeDAO) throws ParseException {
		//create the Employee object
		System.out.println("Creating new employee object ...");
		Employee tempEmployee= new Employee("Guilermo","Hugo","Baltazar","Sanchez","Soltero",format.parse("16/07/1980")
		,"Mexicana",0,"Familiar",1,1,"Nomina");

		//save the student object
		System.out.println("Saving the employee ...");
		employeeDAO.save(tempEmployee);

		//display id of the saved employee
		System.out.println("Saved employee. Generated id: "+tempEmployee.getPersonId());
	}

}






