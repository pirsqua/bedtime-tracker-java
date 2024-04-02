package com.github.justinvinall.bedtimetracker.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.github.justinvinall.bedtimetracker.dto.PrizeDTO;
import com.github.justinvinall.bedtimetracker.entity.Prize;
import com.github.justinvinall.bedtimetracker.mapper.PrizeMapper;
import com.github.justinvinall.bedtimetracker.repository.PrizeRepository;

@Service
public class PrizeService {
    private final PrizeRepository prizeRepository;
    private final PrizeMapper prizeMapper;

    public PrizeService(PrizeRepository prizeRepository, PrizeMapper prizeMapper) {
        this.prizeRepository = prizeRepository;
        this.prizeMapper = prizeMapper;
    }
    
    public List<PrizeDTO> getAllPrizes() {
        List<Prize> prizes = prizeRepository.findAll();
        return prizes.stream()
            .map(prizeMapper::toDTO)
            .collect(Collectors.toList());
    }

    public PrizeDTO getPrizeById(int id) {
        Prize prize = prizeRepository.findById(id).orElse(null);
        return prizeMapper.toDTO(prize);
    }

    public PrizeDTO createPrize(PrizeDTO prizeDTO) {
        Prize prize = prizeMapper.toEntity(prizeDTO);
        Prize savedPrize = prizeRepository.save(prize);
        return prizeMapper.toDTO(savedPrize);
    }
}
