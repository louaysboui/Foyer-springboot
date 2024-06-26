package tn.esprit.foyer.Entities;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt, prenomEt, ecole;
    private long cin;
    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private Set<Reservation> reservations;
}
