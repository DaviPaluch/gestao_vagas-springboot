package br.com.davipaluch.gestao_vagas.modules.candidate;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

// JpaRepository<entidade, chave ou id>
public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

}
