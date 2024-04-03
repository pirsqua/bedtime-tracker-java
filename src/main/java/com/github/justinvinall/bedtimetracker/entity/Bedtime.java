package com.github.justinvinall.bedtimetracker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "bedtime")
public class Bedtime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bedtime_id")
    private Integer bedtimeId;

    @ManyToOne
    @JoinColumn(name = "child_id", nullable = false)
    private Child child;

    @Column(name = "sleep_start", nullable = false)
    private LocalDateTime sleepStart;

    @Column(name = "sleep_end", nullable = false)
    private LocalDateTime sleepEnd;

    @Column(name = "is_success", nullable = false)
    private boolean success;

    @Column(name = "is_nap", nullable = false)
    private boolean nap;

    // Default constructor
    public Bedtime() {
    }

    // Constructor with required fields
    public Bedtime(Child child, LocalDateTime sleepStart, LocalDateTime sleepEnd, boolean success, boolean nap) {
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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
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
