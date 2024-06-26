package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entities.Chambre;
import tn.esprit.foyer.Entities.Foyer;
import tn.esprit.foyer.Entities.Universite;
import tn.esprit.foyer.Repository.ChambreRepository;
import tn.esprit.foyer.Repository.FoyerRepository;
import tn.esprit.foyer.Repository.UniversitieRepository;

import java.util.List;

@Service
@AllArgsConstructor
public abstract class FoyerServiceImpl implements IFoyerService {
    FoyerRepository foyerRepository;
   // UniversitieRepository universitieRepository;
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }
    public Foyer addFoyer(Foyer c) {
        return foyerRepository.save(c);
    }
    public void removeFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }
    public Foyer modifyFoyer(Foyer foyer) {
        return  foyerRepository.save(foyer);
    }
        /*
    public void assignFoyerToUniversite(Long idFoyer, Long idUniversite) {
        Universite universite = universitieRepository.findById(idUniversite).orElse(null);
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);
        universite.getFoyer().add(foyer);
        universitieRepository.save(universite);
    }

         */
}



