package com.example.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="users") //postgresten kaynaklı user isminde tablo oluşturamayız.
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String username;
    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "comment_id") //
    private Comment comments;

    @ManyToMany
    @JoinTable(
            name = "user_films",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private Set<Film> films = new HashSet<>();
}
