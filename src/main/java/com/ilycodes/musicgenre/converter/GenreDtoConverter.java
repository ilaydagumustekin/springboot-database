package com.ilycodes.musicgenre.converter;

import com.ilycodes.musicgenre.dto.GenreResponse;
import com.ilycodes.musicgenre.entity.Genre;
import org.springframework.stereotype.Component;

@Component
public class GenreDtoConverter {

    public GenreResponse convertToDto(Genre genre) {
        if (genre == null) {
            return null;
        }

        return new GenreResponse(genre.getId(), genre.getName());
    }
}
