package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entities.Universite;

import java.util.List;

public interface IReservationService {

    public List<Universite> retrieveAllUniversites();
    public Universite retriveUniversite(Long idUniversite);
    public Universite addUniversite(Universite c);
    public void removeUniversite(Long idUniversite);
    public Universite modifyUniversite(Universite universite);

}
