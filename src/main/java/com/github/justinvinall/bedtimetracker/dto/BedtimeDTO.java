package com.github.justinvinall.bedtimetracker.dto;

import java.time.LocalDateTime;

public class BedtimeDTO {
    private Integer bedtimeId;
    private ChildDTO child;
    private LocalDateTime sleepStart;
    private LocalDateTime sleepEnd;
    private boolean isSuccess;
    private boolean isNap;

    // Constructor
    public BedtimeDTO(Integer bedtimeId, ChildDTO child, LocalDateTime sleepStart,
                      LocalDateTime sleepEnd, boolean isSuccess, boolean isNap) {
        this.bedtimeId = bedtimeId;
        this.child = child;
        this.sleepStart = sleepStart;
        this.sleepEnd = sleepEnd;
        this.isSuccess = isSuccess;
        this.isNap = isNap;
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
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isNap() {
        return isNap;
    }

    public void setIsNap(boolean isNap) {
        this.isNap = isNap;
    }
}