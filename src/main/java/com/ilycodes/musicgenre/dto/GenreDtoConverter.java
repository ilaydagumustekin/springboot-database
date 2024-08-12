package com.ilycodes.musicgenre.dto;

import com.ilycodes.musicgenre.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreDtoConverter {
    public GenreDtoConverter(Genre genre) {
        return new GenreDto(genre.getId(), genre.getName())
    }
}
