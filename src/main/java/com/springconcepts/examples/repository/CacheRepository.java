package com.springconcepts.examples.repository;

import com.springconcepts.examples.entity.CacheEntity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CacheRepository extends JpaRepository<CacheEntity, Long> {


    List<CacheEntity> findAll();
}
