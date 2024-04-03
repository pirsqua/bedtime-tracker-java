package com.github.justinvinall.bedtimetracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.github.justinvinall.bedtimetracker.dto.BedtimeRequestDTO;
import com.github.justinvinall.bedtimetracker.dto.BedtimeResponseDTO;
import com.github.justinvinall.bedtimetracker.service.BedtimeService;

@RestController
@RequestMapping("/api/bedtimes/")
public class BedtimeController {
    private final BedtimeService bedtimeService;

    public BedtimeController(BedtimeService bedtimeService) {
        this.bedtimeService = bedtimeService;
    }

    @GetMapping
    public List<BedtimeResponseDTO> getAllBedtimes() {
        return bedtimeService.getAllBedtimes();
    }

    @GetMapping("/{id}")
    public BedtimeResponseDTO getBedtimeById(@PathVariable int id) {
        return bedtimeService.getBedtimeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BedtimeResponseDTO createBedtime(@RequestBody BedtimeRequestDTO bedtimeRequestDTO) {
        return bedtimeService.createBedtime(bedtimeRequestDTO);
    }
}
