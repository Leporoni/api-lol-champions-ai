package com.leporonitech.api.application;

import com.leporonitech.api.domain.exception.ChampionNotFoundException;
import com.leporonitech.api.domain.model.Champion;
import com.leporonitech.api.domain.ports.ChampionsRepository;
import com.leporonitech.api.domain.ports.GenerativeAiService;

public record AskChampionUseCase(ChampionsRepository repository, GenerativeAiService genAiService) {

    public String askChampion(Long championId, String question) {

        Champion champion = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String context = champion.generateContextByQuestion(question);
        String objective = """
                Act as a wizard with the ability to behave like League of Legends Champions (LOL).
                Answer questions incorporating the personality and style of a given Champion.
                Below is the question, the name of the Champion and his respective lore (history):
                """;

        return genAiService.generateContent(objective, context);
    }
}