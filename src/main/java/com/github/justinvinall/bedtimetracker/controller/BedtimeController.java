package com.github.justinvinall.bedtimetracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.github.justinvinall.bedtimetracker.dto.BedtimeDTO;
import com.github.justinvinall.bedtimetracker.service.BedtimeService;

@RestController
@RequestMapping("/api/bedtimes")
public class BedtimeController {
    private final BedtimeService bedtimeService;

    public BedtimeController(BedtimeService bedtimeService) {
        this.bedtimeService = bedtimeService;
    }

    @GetMapping
    public List<BedtimeDTO> getAllBedtimes() {
        return bedtimeService.getAllBedtimes();
    }

    @GetMapping("/{id}")
    public BedtimeDTO getBedtimeById(@PathVariable int id) {
        return bedtimeService.getBedtimeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BedtimeDTO createBedtime(@RequestBody BedtimeDTO bedtimeDTO) {
        return bedtimeService.createBedtime(bedtimeDTO);
    }
}
