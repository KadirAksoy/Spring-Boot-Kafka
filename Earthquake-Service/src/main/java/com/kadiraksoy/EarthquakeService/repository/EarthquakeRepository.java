package com.kadiraksoy.EarthquakeService.repository;

import com.kadiraksoy.EarthquakeService.model.Earthquake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarthquakeRepository extends JpaRepository<Earthquake, Long> {
}
