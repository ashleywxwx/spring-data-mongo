package com.recursivechaos.boredgames.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class GameCard {

    @Id
    private String id;
    @DBRef
    private Game game;
    private double rating;
    private boolean own;
    private boolean interest;
    private String review;

    public GameCard() {
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOwn() {
        return own;
    }

    public void setOwn(boolean own) {
        this.own = own;
    }

    public boolean isInterest() {
        return interest;
    }

    public void setInterest(boolean interest) {
        this.interest = interest;
    }

}
