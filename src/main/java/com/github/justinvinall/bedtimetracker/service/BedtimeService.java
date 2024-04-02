package com.github.justinvinall.bedtimetracker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.github.justinvinall.bedtimetracker.dto.BedtimeDTO;
import com.github.justinvinall.bedtimetracker.entity.Bedtime;
import com.github.justinvinall.bedtimetracker.mapper.BedtimeMapper;
import com.github.justinvinall.bedtimetracker.repository.BedtimeRepository;

@Service
public class BedtimeService {
    private final BedtimeRepository bedtimeRepository;
    private final BedtimeMapper bedtimeMapper;

    public BedtimeService(BedtimeRepository bedtimeRepository, BedtimeMapper bedtimeMapper) {
        this.bedtimeRepository = bedtimeRepository;
        this.bedtimeMapper = bedtimeMapper;
    }

    public List<BedtimeDTO> getAllBedtimes() {
        List<Bedtime> bedtimes = bedtimeRepository.findAll();
        return bedtimes.stream()
            .map(bedtimeMapper::toDTO)
            .collect(Collectors.toList());
    }

    public BedtimeDTO getBedtimeById(int id) {
        Bedtime bedtime = bedtimeRepository.findById(id).orElse(null);
        return bedtimeMapper.toDTO(bedtime);
    }

    public BedtimeDTO createBedtime(BedtimeDTO bedtimeDTO) {
        Bedtime bedtime = bedtimeMapper.toEntity(bedtimeDTO);
        Bedtime savedBedtime = bedtimeRepository.save(bedtime);
        return bedtimeMapper.toDTO(savedBedtime);
    }
}
