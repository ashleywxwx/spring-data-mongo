package com.recursivechaos.boredgames.controller;

import com.recursivechaos.boredgames.domain.Game;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Controller
public class GameController {


    @ResponseBody
    @RequestMapping("/game")
    public HttpEntity<Game> game(
            @RequestParam(value = "title", required = true) String title,
            @RequestParam(value = "description", required = false) String description) {

        Game game = new Game(title,description);
        game.add(linkTo(methodOn(GameController.class).game(title, description)).withSelfRel());

        return new ResponseEntity<Game>(game, HttpStatus.OK);
    }
}