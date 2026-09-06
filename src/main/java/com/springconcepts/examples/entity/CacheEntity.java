package com.springconcepts.examples.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="app_cache")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CacheEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cache_key")
    private String key;

    @Column(name = "cache_value")
    private String value;

}
