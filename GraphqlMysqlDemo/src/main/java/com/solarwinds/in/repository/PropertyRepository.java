package com.solarwinds.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solarwinds.in.model.Latency_stats;


@Repository
public interface PropertyRepository extends JpaRepository<Latency_stats, Long> {

}
