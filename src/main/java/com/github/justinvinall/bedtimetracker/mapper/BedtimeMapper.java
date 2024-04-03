package com.github.justinvinall.bedtimetracker.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.github.justinvinall.bedtimetracker.dto.BedtimeRequestDTO;
import com.github.justinvinall.bedtimetracker.dto.BedtimeResponseDTO;
import com.github.justinvinall.bedtimetracker.entity.Bedtime;

@Component
public class BedtimeMapper {
    private final ModelMapper modelMapper;

    public BedtimeMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public BedtimeResponseDTO toResponseDTO(Bedtime bedtime) {
        return modelMapper.map(bedtime, BedtimeResponseDTO.class);
    }

    public Bedtime toEntity(BedtimeRequestDTO bedtimeRequestDTO) {
        return modelMapper.map(bedtimeRequestDTO, Bedtime.class);
    }
}
