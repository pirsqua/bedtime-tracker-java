package com.github.justinvinall.bedtimetracker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.github.justinvinall.bedtimetracker.dto.ChildDTO;
import com.github.justinvinall.bedtimetracker.entity.Child;
import com.github.justinvinall.bedtimetracker.mapper.ChildMapper;
import com.github.justinvinall.bedtimetracker.repository.ChildRepository;

@Service
public class ChildService {
    private final ChildRepository childRepository;
    private final ChildMapper childMapper;

    public ChildService(ChildRepository childRepository, ChildMapper childMapper) {
        this.childRepository = childRepository;
        this.childMapper = childMapper;
    }

    public List<ChildDTO> getAllChildren() {
        List<Child> children = childRepository.findAll();
        return children.stream()
            .map(childMapper::toDTO)
            .collect(Collectors.toList());
    }

    public ChildDTO getChildById(int id) {
        Child child = childRepository.findById(id).orElse(null);
        return childMapper.toDTO(child);
    }

    public ChildDTO createChild(ChildDTO childDTO) {
        Child child = childMapper.toEntity(childDTO);
        Child savedChild = childRepository.save(child);
        return childMapper.toDTO(savedChild);
    }
}
