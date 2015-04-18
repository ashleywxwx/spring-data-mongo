package com.recursivechaos.boredgames.repository;

import com.recursivechaos.boredgames.domain.GameCard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameCardRepository extends MongoRepository<GameCard, String> {

}
