package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
