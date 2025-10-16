package br.com.brunoabreu.front_gestao_vagas.modules.candidate.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCandidateDTO {
    private String username;
    private String password;
    private String name;
    private String email;
    private String description;

}
