package com.leporonitech.api.domain.ports;

import com.leporonitech.api.domain.model.Champion;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champion> findAll();

    Optional<Champion> findById(Long id);
}