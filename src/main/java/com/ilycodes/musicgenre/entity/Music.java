package com.ilycodes.musicgenre.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Entity
@Data
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^[a-zA-Z ]+$", message = "Music name can only contain letters and spaces.")
    private String title;

    private String artist;
    private String album;

    @Column(length = 4, unique = true)
    private int releaseYear;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @JsonBackReference
    private Genre genre;

    public void setId(Long id) {
    }
}
