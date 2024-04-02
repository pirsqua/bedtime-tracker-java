package com.github.justinvinall.bedtimetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.justinvinall.bedtimetracker.entity.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Integer> {
    // Add any custom query methods if needed
}