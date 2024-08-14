package com.ilycodes.musicgenre.converter;

import com.ilycodes.musicgenre.dto.MusicResponse;
import com.ilycodes.musicgenre.entity.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicDtoConverter {

    public MusicResponse convertToDto(Music music) {
        if (music == null) {
            return null;
        }
        return new MusicResponse(music.getId(), music.getTitle(), music.getArtist(), music.getAlbum(),music.getGenre(), music.getReleaseYear());
    }
}
