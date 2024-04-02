package com.github.justinvinall.bedtimetracker.dto;

public class PrizeDTO {
    private Integer prizeId;
    private String name;
    private String description;
    private String imageUrl;
    private Integer priority;

    // Constructor
    public PrizeDTO(Integer prizeId, String name, String description, String imageUrl, Integer priority) {
        this.prizeId = prizeId;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.priority = priority;
    }

    // Getters and setters
    public Integer getPrizeId() {
        return prizeId;
    }

    public void setPrizeId(Integer prizeId) {
        this.prizeId = prizeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
