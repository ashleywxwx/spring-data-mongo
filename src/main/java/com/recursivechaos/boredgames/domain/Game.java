package com.recursivechaos.boredgames.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game extends ResourceSupport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    private String title;
    private String description;

    @JsonCreator
    public Game(@JsonProperty("title") String title, @JsonProperty("description") String description) {
        this.title = title;
        this.description = description;
    }

    public Game(){}

    public long getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
