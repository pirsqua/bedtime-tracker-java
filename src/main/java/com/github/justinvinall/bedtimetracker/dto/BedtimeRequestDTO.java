package com.github.justinvinall.bedtimetracker.dto;

import java.time.LocalDateTime;

public class BedtimeRequestDTO {
    private Integer childId;
    private LocalDateTime sleepStart;
    private LocalDateTime sleepEnd;
    private boolean success;
    private boolean nap;

    // Constructors
    public BedtimeRequestDTO() {
    }
    
    public BedtimeRequestDTO(Integer childId, LocalDateTime sleepStart, LocalDateTime sleepEnd,
                             boolean success, boolean nap) {
        this.childId = childId;
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        this.success = success;
        this.nap = nap;
    }

    // Getters and setters
    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
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
