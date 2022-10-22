package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Complexe;
import tn.esprit.spring.repository.ComplexeRepository;

@Service
public class ComplexeServiceImpl implements IComplexeService{

	@Autowired
	private ComplexeRepository CR;
	
	@Override
	public Complexe addComplexe(Complexe c) {
		
		return CR.save(c);
	}

	@Override
	public void DeleteComplexe(long id) {
		CR.deleteById(id);
		
	}

	@Override
	public Complexe updateComplexe(Complexe c) {
	    
		return CR.save(c);
	}

	@Override
	public List<Complexe> showComplexe() {
		List<Complexe> lc = (List<Complexe>) CR.findAll();
		return lc;
	}

}
