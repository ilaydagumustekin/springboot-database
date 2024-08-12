package com.ilycodes.musicgenre.repository;


import com.ilycodes.musicgenre.entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music, Long> {
    List<Music> findByGenreId(Long genreId);
}
