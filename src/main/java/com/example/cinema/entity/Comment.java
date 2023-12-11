package com.example.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String description;
    @Column
    private Long rating;

    @ManyToOne
    @JoinColumn(name = "film_id") //
    private Film films;

    @OneToMany(mappedBy = "comments", cascade = CascadeType.ALL)
    private List<User> users;

}
