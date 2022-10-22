package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Complexe;

@Repository
public interface ComplexeRepository extends CrudRepository<Complexe, Long>{

}
