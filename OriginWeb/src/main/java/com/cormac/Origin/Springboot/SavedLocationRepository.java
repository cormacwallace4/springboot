package com.cormac.Origin.Springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SavedLocationRepository extends JpaRepository<SavedLocation, Long> {
  List<SavedLocation> findByUserId(Long userId);
  Optional<SavedLocation> findByIdAndUserId(Long id, Long userId);
}




