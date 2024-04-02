package com.github.justinvinall.bedtimetracker.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.github.justinvinall.bedtimetracker.dto.ChildDTO;
import com.github.justinvinall.bedtimetracker.entity.Child;

@Component
public class ChildMapper {
    private final ModelMapper modelMapper;

    public ChildMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ChildDTO toDTO(Child child) {
        return modelMapper.map(child, ChildDTO.class);
    }

    public Child toEntity(ChildDTO childDTO) {
        return modelMapper.map(childDTO, Child.class);
    }
}
