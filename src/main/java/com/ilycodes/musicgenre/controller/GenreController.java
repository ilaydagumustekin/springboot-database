package com.ilycodes.musicgenre.controller;

import com.ilycodes.musicgenre.entity.Genre;
import com.ilycodes.musicgenre.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping
    public ResponseEntity<List<Genre>> getAllGenres() {
        List<Genre> genres = genreService.findAll();
        return new ResponseEntity<>(genres, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable Long id) {
        Optional<Genre> genre = genreService.findById(id);
        if (genre.isPresent()) {
            return new ResponseEntity<>(genre.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre) {
        Genre savedGenre = genreService.save(genre);
        return new ResponseEntity<>(savedGenre, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(@PathVariable Long id, @RequestBody Genre genreDetails) {
        Optional<Genre> existingGenreOpt = genreService.findById(id);
        if (existingGenreOpt.isPresent()) {
            Genre existingGenre = existingGenreOpt.get();
            existingGenre.setName(genreDetails.getName());
            genreService.save(existingGenre);
            return new ResponseEntity<>(existingGenre, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenre(@PathVariable Long id) {
        if (genreService.findById(id).isPresent()) {
            genreService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
