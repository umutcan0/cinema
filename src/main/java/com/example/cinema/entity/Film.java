package com.example.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="films")
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

    @ManyToOne
    @JoinColumn(name = "category_id") //
    private Category categories;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @ManyToMany(mappedBy = "films")
    private Set<User> users = new HashSet<>();

}
