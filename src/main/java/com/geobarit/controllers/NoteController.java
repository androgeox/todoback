package com.geobarit.controllers;

import com.geobarit.entity.Note;
import com.geobarit.repository.NoteRepository;
import com.geobarit.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by bga_s on 18.11.2018.
 */
@RestController
public class NoteController {

    @Autowired
    NoteService noteService;


    public NoteController() {
    }

    @RequestMapping( "/")
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
    public Optional<Note> getNoteById(@PathVariable Integer id){
        return noteService.getById(id);
    }
}
