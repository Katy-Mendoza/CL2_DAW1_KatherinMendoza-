package pe.edu.cibertec.Cl2_Katherin_Mendoza.service;

import pe.edu.cibertec.Cl2_Katherin_Mendoza.dto.FilmCreateDto;
import pe.edu.cibertec.Cl2_Katherin_Mendoza.dto.FilmDetailDto;
import pe.edu.cibertec.Cl2_Katherin_Mendoza.dto.FilmDto;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> findAllFilms();

    FilmDetailDto findDetailById(Integer id);

    Boolean updateFilm(FilmDetailDto filmDetailDto);

    Boolean createFilm(FilmCreateDto filmCreateDto);
    Boolean deleteFilmById(Integer id);

}
