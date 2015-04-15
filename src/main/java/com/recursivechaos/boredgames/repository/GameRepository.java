package com.recursivechaos.boredgames.repository;

import com.recursivechaos.boredgames.domain.Game;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GameRepository extends PagingAndSortingRepository<Game, Long> {

    List<Game> findByTitle(@Param("title") String title);

}
