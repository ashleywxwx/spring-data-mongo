package com.recursivechaos.boredgames.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

public class Game {

    @Id
    private long id;

    private String title;
    private String description;

//    @JsonCreator
//    public Game(@JsonProperty("title") String title, @JsonProperty("description") String description) {
//        this.title = title;
//        this.description = description;
//    }

    public Game(){}

    public long getId() {
        return id;
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
