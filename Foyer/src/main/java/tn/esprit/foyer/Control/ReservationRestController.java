package tn.esprit.foyer.Control;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import tn.esprit.foyer.Entities.Reservation;
import tn.esprit.foyer.Entities.Universite;
import tn.esprit.foyer.Service.IReservationService;
import tn.esprit.foyer.Service.ReservationServiceImpl;

import java.util.List;

public class ReservationRestController {

         IReservationService reservationService ;

    @Operation(description = "recuperer toutes les Reservation de la base de données")
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservation() {
        List<Universite> listUniversites = reservationService.retriveAllreservations();
        return listReservation;
    }






}
