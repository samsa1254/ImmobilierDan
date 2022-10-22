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
import tn.esprit.spring.entities.Complexe;
import tn.esprit.spring.service.IComplexeService;


@RestController
@Api(tags = "Complexe")
@RequestMapping("/Complexe")
public class ComplexeController {

	@Autowired
	private IComplexeService ES;
	
	@PutMapping("/Complexe/edit")
	@ResponseBody
	public Complexe editComplexe(@RequestBody Complexe e) {
		return ES.updateComplexe(e);
		
	}
	
    @PostMapping("/Complexe/add")
    @ResponseBody
    public Complexe addComplexe(@RequestBody Complexe e){
    	return ES.addComplexe(e);
    }
    
    @DeleteMapping("/Complexe/delete/{id}")
    @ResponseBody
    public void DeleteComplexe (@PathVariable("id") long id) {
    	ES.DeleteComplexe(id);
  
    }
    
    @GetMapping("/Complexe/showall")
    @ResponseBody
    public List<Complexe> ComplexeShow(){
    	List<Complexe> e = ES.showComplexe();
    	return e;
    }
	
}
