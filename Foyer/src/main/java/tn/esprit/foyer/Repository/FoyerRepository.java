package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {

}
