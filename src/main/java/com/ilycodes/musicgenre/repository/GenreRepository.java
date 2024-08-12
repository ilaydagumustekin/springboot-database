package com.ilycodes.musicgenre.repository;

import com.ilycodes.musicgenre.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GenreRepository extends JpaRepository<Genre, Long> {
}