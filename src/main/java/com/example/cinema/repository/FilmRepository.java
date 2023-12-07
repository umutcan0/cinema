package com.example.cinema.repository;

import com.example.cinema.entity.Comment;
import com.example.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Long> {

}
