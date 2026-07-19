package com.springconcepts.examples.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@NoArgsConstructor
public class JournalEntry {
    @Id
    private String id;
    @NonNull
    private String name;
    private String title;

}
