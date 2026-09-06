package com.springconcepts.examples.service;


import com.springconcepts.examples.entity.JournalEntry;
import com.springconcepts.examples.repository.JournalEntryRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.slf4j.LoggerFactory.getLogger;

@Service
@Slf4j
public class JournalEntryService  {

    @Autowired
    private JournalEntryRepository journalEntryRepository;




    private static final Logger logger= getLogger(JournalEntryService.class);
    public void createEntry(JournalEntry entry)

    {

        entry.setName("Test");

        journalEntryRepository.save(entry);
        logger.info("Checking");
    }

    public void findUserDetails(JournalEntry entry)

    {

        journalEntryRepository.findByName(entry.getName());

    }
}
