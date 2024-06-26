package tn.esprit.foyer.Control;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entities.Etudiant;
import tn.esprit.foyer.Entities.Universite;
import tn.esprit.foyer.Service.IEtudiantService;
import tn.esprit.foyer.Service.IUniversitieService;

import java.util.List;

@Tag(name="Gestion Universite")
@RestController
@RequestMapping("/Universite")
public class UniversiteRestController {

    IUniversitieService universitieService;

    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @Operation(description = "recuperer toutes les Etudiants de la base de données")
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universitieService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId) {
        Universite universite = universitieService.retriveUniversite(chId);
        return universite;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite c) {
        Universite universite = universitieService.addUniversite(c);
        return universite ;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long chId) {
        universitieService.removeUniversite(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-university")
    public Universite modifyUniversite(@RequestBody Universite c) {
        Universite  universite  = universitieService.modifyUniversite(c);
        return universite;
    }
}
