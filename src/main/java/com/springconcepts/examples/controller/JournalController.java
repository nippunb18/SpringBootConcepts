package com.springconcepts.examples.controller;


import com.springconcepts.examples.cache.AppCache;
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

    @Autowired
    private AppCache appcache;
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

    @GetMapping("/getJournal")
    public ResponseEntity<JournalEntry> findUser(@RequestBody JournalEntry myentry)
    {
         return new ResponseEntity<>(HttpStatus.ACCEPTED);

    }

    @GetMapping("/getappcache")
    public String getAppCache()
    {
        return appcache.appCacheMap.get("TEST_KEY");

    }
}
