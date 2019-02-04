package com.geobarit.services;

import com.geobarit.entity.Note;
import com.geobarit.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by bga_s on 25.11.2018.
 */
@Service
@Transactional
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public NoteService() {
    }

    public Optional<Note> getById(Integer id){
        Optional<Note> byId = noteRepository.findById(id);
        return byId;
    }
}
