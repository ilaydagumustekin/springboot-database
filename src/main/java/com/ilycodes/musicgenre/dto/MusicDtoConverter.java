package com.ilycodes.musicgenre.dto;

import com.ilycodes.musicgenre.entity.Music;
import org.springframework.stereotype.Component;

@Component
public class MusicDtoConverter {
    public MusicDtoConverter(Music music) {
        return new MusicDto(music.getId(), music.getTitle(), music.getArtist(), music.getAlbum(), music.getReleaseYear())
    }
}
