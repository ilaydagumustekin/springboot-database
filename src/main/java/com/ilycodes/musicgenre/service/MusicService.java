package com.ilycodes.musicgenre.service;


import com.ilycodes.musicgenre.dto.MusicDtoConverter;
import com.ilycodes.musicgenre.entity.Music;
import com.ilycodes.musicgenre.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicService {
    @Autowired
    private MusicRepository musicRepository;
    private MusicDtoConverter musicDtoConverter;

    public List<Music> findAll() {
        return (List<Music>) musicRepository.findAll();
    }

    public Optional<Music> findById(Long id) {
        return musicRepository.findById(id);
    }

    public Music save(Music music) {
        return musicRepository.save(music);
    }

    public void deleteById(Long id) {
        musicRepository.deleteById(id);
    }

    public List<Music> findByGenreId(Long genreId) {
        return musicRepository.findByGenreId(genreId);
    }
}
