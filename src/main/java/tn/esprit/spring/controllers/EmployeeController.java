package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entities.Employee;
import tn.esprit.spring.service.IEmployeeService;

@RestController
@Api(tags = "Employee")
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService ES;
	
	@PutMapping("/Employee/edit")
	@ResponseBody
	public Employee editEmployee(@RequestBody Employee e) {
		return ES.EditEmployee(e);
		
	}
	
    @PostMapping("/Employee/add")
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee e){
    	return ES.addEmployee(e);
    }
    
    @DeleteMapping("/Employee/delete/{id}")
    @ResponseBody
    public void DeleteEmployee (@PathVariable("id") long id) {
    	ES.deleteEmployee(id);
  
    }
    
    @GetMapping("/Employee/showall")
    @ResponseBody
    public List<Employee> employeeShow(){
    	List<Employee> e = ES.showEmploye();
    	return e;
    }
	
}
