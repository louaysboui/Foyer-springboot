package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
