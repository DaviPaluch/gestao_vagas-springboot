package br.com.davipaluch.gestao_vagas.modules.candidate;

import java.util.UUID;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

// Data é uma annotation do Lombok que cria os getters e setters automaticamente
@Data
@Entity(name = "candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String name;
  @NotBlank(message = "o campo não pode ser vazio")
  @Pattern(regexp = "\\S+", message = "o campo não pode conter espaços")
  private String username;
  @Email(regexp = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$", message = "o campo deve conter um e-mail válido")
  private String email;
  @NotBlank(message = "senha deve ser preenchida")
  @Length(min = 8, max = 100, message = "a senha deve ter entre 8 e 100 caracteres")
  private String password;
  private String description;
  private String curriculum;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
