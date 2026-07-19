package com.springconcepts.examples.service;


import com.springconcepts.examples.entity.JournalEntry;
import com.springconcepts.examples.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JournalEntryService  {

    @Autowired
    private JournalEntryRepository journalEntryRepository;


    public void createEntry(JournalEntry entry)

    {

        entry.setName("Test");

        journalEntryRepository.save(entry);

    }
}
