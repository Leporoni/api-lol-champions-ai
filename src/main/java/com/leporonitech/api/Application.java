package com.leporonitech.api;

import com.leporonitech.api.application.AskChampionUseCase;
import com.leporonitech.api.application.ListChampionsUseCase;
import com.leporonitech.api.domain.ports.ChampionsRepository;
import com.leporonitech.api.domain.ports.GenerativeAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository) {
        return new ListChampionsUseCase(repository);
    }

    @Bean
    public AskChampionUseCase provideAskChampionUseCase(ChampionsRepository repository, GenerativeAiService genAiService) {
        return new AskChampionUseCase(repository, genAiService);
    }
}