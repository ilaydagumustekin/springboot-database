package com.ilycodes.musicgenre.mapper;

import com.ilycodes.musicgenre.dto.GenreResponse;
import com.ilycodes.musicgenre.entity.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreMapper {
    GenreMapper INSTANCE= Mappers.getMapper(GenreMapper.class);

    @Mapping(source = "genre.id",target = "id")
    GenreResponse entityToDto(Genre genre);
}
