package com.leporonitech.api.domain.ports;

public interface GenerativeAiService {

    String generateContent(String objective, String context);
}