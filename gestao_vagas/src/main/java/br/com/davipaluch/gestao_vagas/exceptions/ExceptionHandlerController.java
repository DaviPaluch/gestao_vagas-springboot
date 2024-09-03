package br.com.davipaluch.gestao_vagas.exceptions;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// ControllerAdvice é uma annotation do Spring que indica que o controller é responsável por tratar as exceções
@ControllerAdvice
public class ExceptionHandlerController {

  private MessageSource messageSource;

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public void handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
    e.getBindingResult().getFieldErrors().forEach(error -> {
      String message = messageSource.getMessage(error, LocaleContextHolder.getLocale());
    });
  }
}
