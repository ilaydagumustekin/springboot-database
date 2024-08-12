package com.ilycodes.musicgenre.dto;

import com.ilycodes.musicgenre.entity.Genre;
import lombok.Data;

@Data
public class MusicDto {
    private Long id;
    private String title;
    private String artist;
    private String album;
    private Genre genre;
    private int releaseYear;

    public MusicDto(Long id, String title, String artist, String album, Genre genre, int releaseYear) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

}
