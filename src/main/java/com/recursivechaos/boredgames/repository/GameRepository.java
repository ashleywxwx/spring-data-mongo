package com.recursivechaos.boredgames.repository;

import com.recursivechaos.boredgames.domain.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends MongoRepository<Game, String> {

    List<Game> findByTitle(@Param("title") String title);

}
