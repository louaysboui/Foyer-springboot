package tn.esprit.foyer.Control;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entities.Bloc;
import tn.esprit.foyer.Entities.Foyer;
import tn.esprit.foyer.Service.IBlocService;
import tn.esprit.foyer.Service.IFoyerService;
import tn.esprit.foyer.Service.IUniversitieService;
import tn.esprit.foyer.Service.UniversitieServiceImpl;

import java.util.List;

@Tag(name="Gestion Foyer")
@RestController
@RequestMapping("/foyer")
public class FoyerRestController {


    IFoyerService foyerService;
   // IUniversitieService universitieService;


    @Operation(description = "recuperer toutes les foyers de la base de données")
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService
                .retrieveAllFoyers();
        return listFoyers;
    }

    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.retrieveFoyer(chId);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-foyer")
    @ResponseBody
    public Foyer addFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.addFoyer(c);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.removeFoyer(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-foyer")
    public Foyer modifyBloc(@RequestBody Foyer c) {
        Foyer foyer = foyerService.modifyFoyer(c);
        return foyer;
    }
/*
    @PutMapping(value = "/assignFoyerToUniversite/{idFoyer}/{idUniversite}")
    public void assignFoyerToUniversite(@PathVariable("idFoyer") Long idFoyer, @PathVariable("idUniversite") Long idUniversite) {
        universitieService.assignFoyerToUniversite(idFoyer, idUniversite);
    }

 */




}
