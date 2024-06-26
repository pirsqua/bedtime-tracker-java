package com.github.justinvinall.bedtimetracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "prize")
public class Prize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prize_id")
    private Integer prizeId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "image_url", length = 2048)
    private String imageUrl;

    @Column(name = "priority")
    private Integer priority;

    // Default constructor
    public Prize() {
    }

    // Constructor with required fields
    public Prize(String name, String description, String imageUrl, Integer priority) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.priority = priority;
    }

    // Getters and setters
    public Integer getPrizeId() {
        return prizeId;
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
