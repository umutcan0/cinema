package com.example.cinema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="film")
public class Film {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String category;
    @Column
    private String name;
    @Column
    private  String subject;
    @Column
    private Integer releaseDate;
    @Column
    private String actors;

}
