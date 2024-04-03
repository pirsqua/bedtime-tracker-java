package com.github.justinvinall.bedtimetracker.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BedtimeRequestDTO {
    private Integer childId;
    private LocalDateTime sleepStart;
    private LocalDateTime sleepEnd;
    private boolean isSuccess;
    private boolean isNap;

    // Constructors
    public BedtimeRequestDTO() {
    }
    
    public BedtimeRequestDTO(Integer childId, LocalDateTime sleepStart, LocalDateTime sleepEnd,
                             boolean isSuccess, boolean isNap) {
        this.childId = childId;
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        this.isSuccess = isSuccess;
        this.isNap = isNap;
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

    // Set JSON name explicitly since Jackson would otherwise use "success" instead of "isSuccess"
    @JsonProperty("isSuccess")
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    // Set JSON name explicitly since Jackson would otherwise use "nap" instead of "isNap"
    @JsonProperty("isNap")
    public boolean isNap() {
        return isNap;
    }

    public void setNap(boolean isNap) {
        this.isNap = isNap;
    }
}
