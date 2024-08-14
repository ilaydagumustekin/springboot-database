package com.ilycodes.musicgenre.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class GenreRequest {
    private Long id;
    @NotBlank(message = "name should not be null")
    private String name;
}
