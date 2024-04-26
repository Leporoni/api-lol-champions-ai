package com.leporonitech.api.application;

import com.leporonitech.api.domain.model.Champion;
import com.leporonitech.api.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champion> findAll() {
        return repository.findAll();
    }
}