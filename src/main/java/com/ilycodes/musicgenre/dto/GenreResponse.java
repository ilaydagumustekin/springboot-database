package com.ilycodes.musicgenre.dto;


import lombok.Data;

@Data
public class GenreResponse {
    private Long id;
    private String name;

    public GenreResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
