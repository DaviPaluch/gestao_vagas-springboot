package br.com.davipaluch.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.davipaluch.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.davipaluch.gestao_vagas.modules.candidate.CandidateRepository;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  // Autowired significa que o Spring será responsável pela instanciação do objeto
  @Autowired
  private CandidateRepository candidateRepository;

  @PostMapping()
  public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
    System.out.println("Criando novo candidato");

    return this.candidateRepository.save(candidateEntity);
  }
}
