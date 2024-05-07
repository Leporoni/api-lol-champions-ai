package com.leporonitech.api.adapters.out;

import feign.FeignException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class GoogleGeminiServiceTest {

    @Mock
    private GoogleGeminiService.GoogleGeminiResp mockResponse;

    @Mock
    private GoogleGeminiService.Candidate mockCandidate;

    @Mock
    private GoogleGeminiService.Content mockContent;

    @Mock
    private GoogleGeminiService.Part mockPart;

    @Test
    public void testGenerateContentSuccess() {
        String objetivo = "Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).";
        String contexto = "Escreva sobre um mago.";
        String respostaEsperada = "Considerado pela grande maioria como o mago mais habilidoso de Runeterra";

        // Mock da estrutura de resposta da API
        when(mockPart.text()).thenReturn(respostaEsperada);
        when(mockContent.parts()).thenReturn(List.of(mockPart));
        when(mockCandidate.content()).thenReturn(mockContent);
        when(mockResponse.candidates()).thenReturn(List.of(mockCandidate));

        // Criar um spy do GoogleGeminiService
        GoogleGeminiService geminiServiceSpy = Mockito.spy(new GoogleGeminiService() {
            @Override
            public GoogleGeminiResp textOnlyInput(GoogleGeminiReq req) {
                // Retornar a resposta mockada
                return mockResponse;
            }
        });

        // Chamar o método em teste
        String respostaAtual = geminiServiceSpy.generateContent(objetivo, contexto);

        // Verificar se textOnlyInput foi chamado
        verify(geminiServiceSpy).textOnlyInput(Mockito.any());

        // Verificar a resposta
        assertEquals(respostaEsperada, respostaAtual);
    }

    @Test
    public void testGenerateContentEmptyResponse() {
        String objetivo = "Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).";
        String contexto = "Escreva sobre um mago.";
        String respostaEsperada = "It got even worse! The Gemini API return does not contain the expected data.";

        // Mockar resposta vazia
        when(mockResponse.candidates()).thenReturn(Collections.emptyList());

        // Criar um spy do GoogleGeminiService
        GoogleGeminiService geminiServiceSpy = Mockito.spy(new GoogleGeminiService() {
            @Override
            public GoogleGeminiResp textOnlyInput(GoogleGeminiReq req) {
                // Retornar a resposta mockada (vazia)
                return mockResponse;
            }
        });

        // Chamar o método em teste
        String respostaAtual = geminiServiceSpy.generateContent(objetivo, contexto);

        // Verificar se textOnlyInput foi chamado
        verify(geminiServiceSpy).textOnlyInput(Mockito.any());

        // Verificar a resposta
        assertEquals(respostaEsperada, respostaAtual);
    }

    @Test
    public void testGenerateContentFeignException() {
        String objetivo = "Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).";
        String contexto = "Escreva sobre um mago.";
        String respostaEsperada = "It got even worse! The Gemini API return does not contain the expected data.";

        // Criar um spy do GoogleGeminiService
        GoogleGeminiService geminiServiceSpy = Mockito.spy(new GoogleGeminiService() {
            @Override
            public GoogleGeminiResp textOnlyInput(GoogleGeminiReq req) {
                // Lançar a exceção FeignException
                throw new FeignException.FeignClientException(400, "Erro", null, null, null);
            }
        });

        // Chamar o método em teste
        String respostaAtual = geminiServiceSpy.generateContent(objetivo, contexto);

        // Verificar se textOnlyInput foi chamado
        verify(geminiServiceSpy).textOnlyInput(Mockito.any());

        // Verificar a resposta
        assertEquals(respostaEsperada, respostaAtual);
    }

    @Test
    public void testGenerateContentUnexpectedException() {
        String objetivo = "Atue como um assistente com a habilidade de se comportar como os Campeões do League of Legends (LOL).";
        String contexto = "Escreva sobre um mago.";
        String respostaEsperada = "It got even worse! The Gemini API return does not contain the expected data.";

        // Criar um spy do GoogleGeminiService
        GoogleGeminiService geminiServiceSpy = Mockito.spy(new GoogleGeminiService() {
            @Override
            public GoogleGeminiResp textOnlyInput(GoogleGeminiReq req) {
                // Lançar uma exceção inesperada
                throw new RuntimeException("Erro inesperado");
            }
        });

        // Chamar o método em teste
        String respostaAtual = geminiServiceSpy.generateContent(objetivo, contexto);

        // Verificar se textOnlyInput foi chamado
        verify(geminiServiceSpy).textOnlyInput(Mockito.any());

        // Verificar a resposta
        assertEquals(respostaEsperada, respostaAtual);
    }
}