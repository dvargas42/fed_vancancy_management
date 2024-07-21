package br.com.vargas.fed_vacancy_management.modules.candidate.dto;

import java.util.List;

import lombok.Data;

@Data
public class CandidateLoginRespDTO {
    
    private String access_token;
    private List<String> roles;
    private Long expires_in;
}
