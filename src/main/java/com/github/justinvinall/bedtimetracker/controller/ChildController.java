package com.github.justinvinall.bedtimetracker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.github.justinvinall.bedtimetracker.dto.ChildDTO;
import com.github.justinvinall.bedtimetracker.service.ChildService;

@RestController
@RequestMapping("/api/children/")
public class ChildController {
    private final ChildService childService;

    public ChildController(ChildService childService) {
        this.childService = childService;
    }

    @GetMapping
    public List<ChildDTO> getAllChildren() {
        return childService.getAllChildren();
    }

    @GetMapping("/{id}")
    public ChildDTO getChildById(@PathVariable int id) {
        return childService.getChildById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ChildDTO createChild(@RequestBody ChildDTO childDTO) {
        return childService.createChild(childDTO);
    }
}
