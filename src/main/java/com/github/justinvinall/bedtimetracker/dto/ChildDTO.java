package com.github.justinvinall.bedtimetracker.dto;

public class ChildDTO {
    private Integer childId;
    private String name;

    // Constructor
    public ChildDTO(Integer childId, String name) {
        this.childId = childId;
        this.name = name;
    }

    // Getters and setters
    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}