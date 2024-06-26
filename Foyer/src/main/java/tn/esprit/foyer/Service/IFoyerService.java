package tn.esprit.foyer.Service;

import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entities.Chambre;
import tn.esprit.foyer.Entities.Foyer;
import tn.esprit.foyer.Entities.Universite;

import java.util.List;

public interface IFoyerService {


    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long idFoyer);
    Foyer addFoyer(Foyer c);
    public void removeFoyer(Long idFoyer);
    public Foyer modifyFoyer(Foyer foyer);



}

