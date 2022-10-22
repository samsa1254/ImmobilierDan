package tn.esprit.spring.service;
import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employee;
import tn.esprit.spring.entities.Section;

@Service
public interface IEmployeeService {
	
	public Employee addEmployee(Employee employee);
	public void deleteEmployee(long id);
	public List<Employee> showEmploye();
	public Employee EditEmployee(Employee employee);
	public Section retrieveEmployeeByName(String Name);
	

}
