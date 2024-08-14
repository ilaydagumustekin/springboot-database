package com.ilycodes.musicgenre.mapper;

import com.ilycodes.musicgenre.dto.MusicResponse;
import com.ilycodes.musicgenre.entity.Music;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MusicMapper {
    MusicMapper INSTANCE= Mappers.getMapper(MusicMapper.class);

    @Mapping(source = "music.id",target = "id")
    MusicResponse entityToDto(Music music);
}
