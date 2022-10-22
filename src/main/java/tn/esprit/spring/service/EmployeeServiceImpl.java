package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Employee;
import tn.esprit.spring.entities.Section;
import tn.esprit.spring.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository ER;
	
	@Override
	public Employee addEmployee(Employee employee) {
	    Employee e = ER.save(employee);
		return e;
	}

	@Override
	public void deleteEmployee(long id) {
		ER.deleteById(id);
		
	}

	@Override
	public List<Employee> showEmploye() {
		List<Employee> e = (List<Employee>) ER.findAll();
		return e;
	}

	@Override
	public Employee EditEmployee(Employee employee) {
		return ER.save(employee);
		
	}

	@Override
	public Section retrieveEmployeeByName(String Name) {
		return null;
//		return (List<Employee>) ER.findById(null);
	}

}
