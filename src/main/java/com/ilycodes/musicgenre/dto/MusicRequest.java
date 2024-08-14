package com.ilycodes.musicgenre.dto;


import com.ilycodes.musicgenre.entity.Genre;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class MusicRequest {
    private Long id;
    @NotBlank(message = "title should not be null")
    private String title;
    @NotBlank(message = "artist should not be null")
    private String artist;
    @NotBlank(message = "album should not be null")
    private String album;
    private Genre genre;
    @Range(max=4)
    private int releaseYear;
}
