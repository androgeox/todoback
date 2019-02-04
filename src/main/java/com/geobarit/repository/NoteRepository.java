package com.geobarit.repository;

import com.geobarit.entity.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bga_s on 25.11.2018.
 */
@Repository
public interface NoteRepository extends CrudRepository<Note, Integer> {
}
