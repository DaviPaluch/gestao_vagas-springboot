package br.com.davipaluch.gestao_vagas.modules.candidate;

import java.util.UUID;

import lombok.Data;

// Data é uma annotation do Lombok que cria os getters e setters automaticamente
@Data
public class CandidateEntity {
  private UUID id;
  private String name;
  private String username;
  private String email;
  private String password;
  private String description;
  private String curriculum;
}
