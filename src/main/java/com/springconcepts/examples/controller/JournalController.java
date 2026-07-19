package com.springconcepts.examples.controller;


import com.springconcepts.examples.entity.JournalEntry;
import com.springconcepts.examples.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalController {



    @Autowired
    private JournalEntryService journalEntryService;
    @GetMapping("/getAll")
    public String getAllEntry()
    {

        return "Hello";

    }


    @PostMapping("/createuser")
    public ResponseEntity<JournalEntry> createUser(@RequestBody JournalEntry myEntry)

    {


        journalEntryService.createEntry(myEntry);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);


    }
}
