package com.springconcepts.examples.repository;

import com.springconcepts.examples.entity.JournalEntry;
import jakarta.persistence.Id;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepository extends JpaRepository <JournalEntry, String> {
}
