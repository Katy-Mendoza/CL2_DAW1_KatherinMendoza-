package pe.edu.cibertec.Cl2_Katherin_Mendoza.dto;

public record FilmDto(Integer filmId,
                      String title,
                      String language,
                      Integer rentalDuration,
                      Double rentalRate) {
}
