package com.leporonitech.api.application;

import com.leporonitech.api.domain.exception.ChampionNotFoundException;
import com.leporonitech.api.domain.model.Champion;
import com.leporonitech.api.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question) {

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String context = champion.generateContextByQuestion(question);

        return question;
    }
}