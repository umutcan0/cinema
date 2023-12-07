package com.example.cinema.service;

import com.example.cinema.entity.Film;

import java.util.List;

public interface FilmService {

    public Film getFilm(Long id);
    public List<Film> getAllFilm();
    public Film createFilm(Film film);
    public Film updateFilm(Long id, Film film);
    public void deleteFilm(Long id);
}
