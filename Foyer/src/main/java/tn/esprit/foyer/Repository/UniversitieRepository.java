package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entities.Universite;

@Repository
public interface UniversitieRepository extends JpaRepository<Universite,Long> {

}
