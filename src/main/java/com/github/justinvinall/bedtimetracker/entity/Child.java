package com.github.justinvinall.bedtimetracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "child")
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id")
    private Integer childId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    // Constructor
    public Child(String name) {
        this.name = name;
    }

    // Getters and setters

}
