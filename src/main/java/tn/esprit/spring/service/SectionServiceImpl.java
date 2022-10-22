package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Section;
import tn.esprit.spring.repository.SectionRepository;

@Service
public class SectionServiceImpl implements ISectionService{

	@Autowired
	private SectionRepository SR;

	@Override
	public Section addSection(Section section) {
		return SR.save(section);
	}

	@Override
	public Section EditSection(Section section) {
		return SR.save(section);
	}

	@Override
	public void deleteSectionByid(Long id) {
		SR.deleteById(id);	
	}

	@Override
	public List<Section> retrieveSections() {
		List<Section> s = (List<Section>) SR.findAll();
		return s;
	}

	@Override
	public Section retrieveSectionById(Long id) {
		return SR.findById(id).get();
	}
	
	

	
}
