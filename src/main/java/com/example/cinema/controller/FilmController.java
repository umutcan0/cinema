package com.example.cinema.controller;

import com.example.cinema.entity.Film;
import com.example.cinema.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilm(@PathVariable Long id) {
        Film film = filmService.getFilm(id);
        return ResponseEntity.status(HttpStatus.OK).body(film);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Film>> getAllFilm() {
        List<Film> film = filmService.getAllFilm();
        return ResponseEntity.ok(film);
    }

    @PostMapping("/create")
    public ResponseEntity<Film> createFilm(@RequestBody Film film) {
        Film createdFilm = filmService.createFilm(film);
        return ResponseEntity.ok(createdFilm);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Film> updateFilm(@PathVariable Long id, @RequestBody Film film) {
        Film updatedFilm = filmService.updateFilm(id, film);
        return ResponseEntity.ok(updatedFilm);
    }

    @DeleteMapping("/{id}")
    public void deleteFilm(@PathVariable Long id){
        filmService.deleteFilm(id); // Response var ancak Body yok.
    }

}
