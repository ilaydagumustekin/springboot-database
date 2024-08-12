package com.ilycodes.musicgenre.dto;


import lombok.Data;

@Data
public class GenreDto {
    private Long id;
    private String name;

    public GenreDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
