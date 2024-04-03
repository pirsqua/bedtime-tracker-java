package com.github.justinvinall.bedtimetracker.dto;

import java.time.LocalDateTime;

public class BedtimeResponseDTO {
    private Integer bedtimeId;
    private ChildDTO child;
    private LocalDateTime sleepStart;
    private LocalDateTime sleepEnd;
    private boolean success;
    private boolean nap;

    // Constructors
    public BedtimeResponseDTO() {
    }
    
    public BedtimeResponseDTO(Integer bedtimeId, ChildDTO child, LocalDateTime sleepStart,
                              LocalDateTime sleepEnd, boolean success, boolean nap) {
        this.bedtimeId = bedtimeId;
        this.child = child;
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        this.success = success;
        this.nap = nap;
    }

    // Getters and setters
    public Integer getBedtimeId() {
        return bedtimeId;
    }

    public void setBedtimeId(Integer bedtimeId) {
        this.bedtimeId = bedtimeId;
    }

    public ChildDTO getChild() {
        return child;
    }

    public void setChild(ChildDTO child) {
        this.child = child;
    }

    public LocalDateTime getSleepStart() {
        return sleepStart;
    }

    public void setSleepStart(LocalDateTime sleepStart) {
        this.sleepStart = sleepStart;
    }

    public LocalDateTime getSleepEnd() {
        return sleepEnd;
    }

    public void setSleepEnd(LocalDateTime sleepEnd) {
        this.sleepEnd = sleepEnd;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isNap() {
        return nap;
    }

    public void setNap(boolean nap) {
        this.nap = nap;
    }
}
