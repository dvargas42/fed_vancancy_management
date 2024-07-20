package br.com.vargas.fed_vacancy_management.modules.candidate.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.vargas.fed_vacancy_management.modules.candidate.dto.CandidateLoginRespDTO;

@Service
public class CandidateService {
    
    public CandidateLoginRespDTO login(String username, String password) {
        RestTemplate rt = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, String> data = new HashMap<>();
        data.put("username",username);
        data.put("password",password);

        HttpEntity<Map<String, String>> request = new HttpEntity<>(data, headers);

        var result = rt.postForObject("http://localhost:8080/candidate/auth", request, CandidateLoginRespDTO.class);

        return result;
    }
}
