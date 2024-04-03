package com.github.justinvinall.bedtimetracker.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.github.justinvinall.bedtimetracker.dto.PrizeDTO;
import com.github.justinvinall.bedtimetracker.entity.Prize;

@Component
public class PrizeMapper {
    private final ModelMapper modelMapper;

    public PrizeMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PrizeDTO toDTO(Prize prize) {
        return modelMapper.map(prize, PrizeDTO.class);
    }

    public Prize toEntity(PrizeDTO prizeDTO) {
        return modelMapper.map(prizeDTO, Prize.class);
    }
}
