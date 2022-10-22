package tn.esprit.spring.service;
import java.util.List;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Section;

@Service
public interface ISectionService {
public Section addSection(Section section);
public Section EditSection(Section section);
public void deleteSectionByid(Long id);
public List<Section> retrieveSections();
public Section retrieveSectionById(Long id);
	
}
