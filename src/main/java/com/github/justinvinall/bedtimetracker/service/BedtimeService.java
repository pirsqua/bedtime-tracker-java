package com.github.justinvinall.bedtimetracker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.github.justinvinall.bedtimetracker.dto.BedtimeRequestDTO;
import com.github.justinvinall.bedtimetracker.dto.BedtimeResponseDTO;
import com.github.justinvinall.bedtimetracker.entity.Bedtime;
import com.github.justinvinall.bedtimetracker.entity.Child;
import com.github.justinvinall.bedtimetracker.mapper.BedtimeMapper;
import com.github.justinvinall.bedtimetracker.mapper.ChildMapper;
import com.github.justinvinall.bedtimetracker.repository.BedtimeRepository;
import com.github.justinvinall.bedtimetracker.repository.ChildRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BedtimeService {
    private final BedtimeRepository bedtimeRepository;
    private final ChildRepository childRepository;
    private final BedtimeMapper bedtimeMapper;
    private final ChildMapper childMapper;

    public BedtimeService(BedtimeRepository bedtimeRepository, ChildRepository childRepository,
                          BedtimeMapper bedtimeMapper, ChildMapper childMapper)
    {
        this.bedtimeRepository = bedtimeRepository;
        this.childRepository = childRepository;
        this.bedtimeMapper = bedtimeMapper;
        this.childMapper = childMapper;
    }

    public List<BedtimeResponseDTO> getAllBedtimes() {
        List<Bedtime> bedtimes = bedtimeRepository.findAll();
        return bedtimes.stream()
            .map(bedtimeMapper::toResponseDTO)
            .collect(Collectors.toList());
    }

    public BedtimeResponseDTO getBedtimeById(int id) {
        Bedtime bedtime = bedtimeRepository.findById(id).orElse(null);
        return bedtimeMapper.toResponseDTO(bedtime);
    }

    public BedtimeResponseDTO createBedtime(BedtimeRequestDTO bedtimeRequestDTO) {
        // Map the BedtimeRequestDTO to Bedtime entity
        Bedtime bedtime = bedtimeMapper.toEntity(bedtimeRequestDTO);
        
        // Fetch the Child entity based on the childId
        Child child = childRepository.findById(bedtimeRequestDTO.getChildId())
            .orElseThrow(() -> new EntityNotFoundException("Child not found"));
        
        bedtime.setChild(child);
        
        // Save the Bedtime entity
        Bedtime savedBedtime = bedtimeRepository.save(bedtime);

        // Map the saved entity to BedtimeResponseDTO
        BedtimeResponseDTO responseDTO = bedtimeMapper.toResponseDTO(savedBedtime);
        responseDTO.setChild(childMapper.toDTO(child));

        return responseDTO;
    }
}
