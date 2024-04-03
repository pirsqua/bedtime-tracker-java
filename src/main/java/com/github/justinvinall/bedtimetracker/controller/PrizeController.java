package com.github.justinvinall.bedtimetracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.github.justinvinall.bedtimetracker.dto.PrizeDTO;
import com.github.justinvinall.bedtimetracker.service.PrizeService;

@RestController
@RequestMapping("/api/prizes/")
public class PrizeController {
    private final PrizeService prizeService;

    public PrizeController(PrizeService prizeService) {
        this.prizeService = prizeService;
    }

    @GetMapping
    public List<PrizeDTO> getAllPrizes() {
        return prizeService.getAllPrizes();
    }

    @GetMapping("/{id}")
    public PrizeDTO getPrizeById(@PathVariable int id) {
        return prizeService.getPrizeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PrizeDTO createPrize(@RequestBody PrizeDTO prizeDTO) {
        return prizeService.createPrize(prizeDTO);
    }
}
