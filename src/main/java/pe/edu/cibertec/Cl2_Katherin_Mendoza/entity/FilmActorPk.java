package pe.edu.cibertec.Cl2_Katherin_Mendoza.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmActorPk {

    private Integer actorId;
    private Integer filmId;

}