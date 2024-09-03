package br.com.davipaluch.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.davipaluch.gestao_vagas.modules.candidate.CandidateEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @GetMapping()
  public String getMethodName() {
    return "Hello ";
  }

  @PostMapping()
  public void create(@RequestBody CandidateEntity candidateEntity) {
    System.out.println("Criando novo candidato");
    System.out.println(candidateEntity.getEmail());
  }
}
