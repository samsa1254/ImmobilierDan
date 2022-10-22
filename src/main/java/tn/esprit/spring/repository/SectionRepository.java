package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Section;


@Repository
public interface SectionRepository extends CrudRepository<Section, Long>{


}


//@Repository
//public interface OfferRepository extends CrudRepository<Offer, Long> {
//
//	@Query("SELECT c FROM Offer c where c.name= :name ")
//	List<Offer> getOfferbyName(@Param("name") String name);
//	
//}
