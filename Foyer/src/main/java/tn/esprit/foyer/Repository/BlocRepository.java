package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {

}
