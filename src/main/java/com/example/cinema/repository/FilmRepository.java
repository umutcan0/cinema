package com.example.cinema.repository;

import com.example.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film,Long> {
    @Query("select f, count(c) From Film f left join Comment c on c.films.id=?1 where f.id=?1")
    Optional<Film> findByIdWithCommentCount(Long id);//Query yazarsak metod isminin bir önemi yok. Yazmassak önemli.

}
