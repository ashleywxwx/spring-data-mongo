package com.recursivechaos.boredgames.domain;

import org.springframework.data.annotation.Id;

public class Game {

    @Id
    private String id;
    private String title;
    private String description;

    public Game() {
    }

    public Game(String id){
        this.id = id;
    }

    public String getId() {
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
