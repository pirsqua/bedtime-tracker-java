package com.github.justinvinall.bedtimetracker.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.github.justinvinall.bedtimetracker.dto.BedtimeDTO;
import com.github.justinvinall.bedtimetracker.entity.Bedtime;

@Component
public class BedtimeMapper {
    private final ModelMapper modelMapper;

    public BedtimeMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public BedtimeDTO toDTO(Bedtime bedtime) {
        return modelMapper.map(bedtime, BedtimeDTO.class);
    }

    public Bedtime toEntity(BedtimeDTO bedtimeDTO) {
        return modelMapper.map(bedtimeDTO, Bedtime.class);
    }
}