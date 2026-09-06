package com.springconcepts.examples.repository;

import com.springconcepts.examples.entity.JournalEntry;
import jakarta.persistence.Id;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalEntryRepository extends JpaRepository <JournalEntry, String> {

    List<JournalEntry> findByName(String name);

}
