package ProviderITAcademy.Resources;

import ProviderITAcademy.Services.ObjectNotFound;

import javax.servlet.ServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourcesException {

  @ExceptionHandler(ObjectNotFound.class)
  public ResponseEntity<StandardError> objectNotFound(
    ObjectNotFound e,
    ServletRequest request
  ) {
    StandardError error = new StandardError(
      System.currentTimeMillis(),
      HttpStatus.NOT_FOUND.value(),
      e.getMessage()
    );
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  }
}
