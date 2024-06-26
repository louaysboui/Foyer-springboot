package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entities.Bloc;
import tn.esprit.foyer.Entities.Universite;
import tn.esprit.foyer.Repository.BlocRepository;
import tn.esprit.foyer.Repository.UniversitieRepository;

import java.util.List;

@AllArgsConstructor
@Service
public abstract class UniversitieServiceImpl implements IUniversitieService{

    UniversitieRepository universiteRepository;

 //  public void assignFoyerToUniversite(Long idFoyer, Long idUniversite) {
  // }

    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retriveUniversite(Long idUniversite) { return universiteRepository.findById(idUniversite).get(); }
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
