package com.geobarit.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created by bga_s on 18.11.2018.
 */
@Table(name = "\"NOTE\"")
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;

    public Note() {
    }

    public Note(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
