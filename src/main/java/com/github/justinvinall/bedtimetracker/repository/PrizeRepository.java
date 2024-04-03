package com.github.justinvinall.bedtimetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.justinvinall.bedtimetracker.entity.Prize;

@Repository
public interface PrizeRepository extends JpaRepository<Prize, Integer> {
    // Add any custom query methods if needed
}
