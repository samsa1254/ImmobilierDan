package tn.esprit.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Complexe;

@Service
public interface IComplexeService {
 public Complexe addComplexe(Complexe c);
 public void DeleteComplexe(long id);
 public Complexe updateComplexe(Complexe c);
 public List<Complexe> showComplexe();
 
}
