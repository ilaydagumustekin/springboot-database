package com.ilycodes.musicgenre.controller;

import com.ilycodes.musicgenre.dto.MusicRequest;
import com.ilycodes.musicgenre.entity.Music;
import com.ilycodes.musicgenre.service.MusicService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/musics")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @GetMapping
    public ResponseEntity<List<Music>> getAllMusics() {
        List<Music> musics = musicService.findAll();
        return ResponseEntity.ok(musics);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Music> getMusicById(@PathVariable Long id) {
        Optional<Music> music = musicService.findById(id);
        return music.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Music> createMusic(@RequestBody Music music) {
        Music savedMusic = musicService.save(music);
        return ResponseEntity.ok(savedMusic);
    }
    @PostMapping("/musics")
    public ResponseEntity<Music> createMusic(@RequestBody @Valid MusicRequest musicRequest) {
       return musicService.saveMusic(musicRequest);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Music> updateMusic(@PathVariable Long id, @RequestBody Music music) {
        if (!musicService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        music.setId(id);
        return ResponseEntity.ok(musicService.save(music));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMusic(@PathVariable Long id) {
        if (!musicService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        musicService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/genres/{genreId}/musics")
    public ResponseEntity<List<Music>> getMusicsByGenre(@PathVariable Long genreId) {
        return ResponseEntity.ok(musicService.findByGenreId(genreId));
    }
}
