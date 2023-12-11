package com.example.cinema.service;

import com.example.cinema.entity.Film;
import com.example.cinema.exception.FilmNotFoundException;
import com.example.cinema.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService{
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public Film getFilm(Long id){
        return filmRepository.findById(id).orElseThrow(() ->{
            throw new FilmNotFoundException("Film mevcut değil",id);
        });
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }

    @Override
    public Film createFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Long id, Film film){
        Film existingFilm = filmRepository.findById(id).orElseThrow(() ->
                new FilmNotFoundException("Film bulunamadı", id));

        existingFilm.setName(film.getName());

        return filmRepository.save(existingFilm);
    }

    @Override
    public void deleteFilm(Long id){
        filmRepository.deleteById(id);
    }
}
