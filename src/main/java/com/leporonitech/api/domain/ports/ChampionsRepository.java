package com.leporonitech.api.domain.ports;

import com.leporonitech.api.domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champions> findAll();

    Optional<Champions> findById(Long id);
}