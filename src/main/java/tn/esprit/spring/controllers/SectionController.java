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
import tn.esprit.spring.entities.Section;
import tn.esprit.spring.service.ISectionService;

@RestController
@Api(tags = "Section")
@RequestMapping("/Section")
public class SectionController {

	@Autowired
	private ISectionService SS;
	
	@PostMapping("/AddSection")
	@ResponseBody 
	public Section addSection(@RequestBody Section section)
	{
		Section o= SS.addSection(section);
		return o ; 
		
	}
	
	@DeleteMapping("/DeleteSection/{id}")
	@ResponseBody 
	public void deleteSection(@PathVariable("id") long id)
	{
		
		SS.deleteSectionByid(id); 
		
	}
	
	@GetMapping("/AllSection")
	@ResponseBody
	public List<Section> Showall(){
		List<Section> p = SS.retrieveSections();
		return p;
	}
	
	@PutMapping("/EditSection")
	@ResponseBody
	public Section Update(@RequestBody Section s){
		Section p = SS.EditSection(s);
		return p;
	}
}

