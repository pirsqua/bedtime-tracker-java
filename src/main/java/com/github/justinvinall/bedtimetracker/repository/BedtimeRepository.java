package com.github.justinvinall.bedtimetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.justinvinall.bedtimetracker.entity.Bedtime;

@Repository
public interface BedtimeRepository extends JpaRepository<Bedtime, Integer> {
    // Add any custom query methods if needed
}