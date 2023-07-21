package ProviderITAcademy.Services;

import ProviderITAcademy.ProjectDomain.Variables;
import ProviderITAcademy.Repository.ProjectRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbServices {

  @Autowired
  private ProjectRepository projectRepository;

  public void instance() {
    Variables t1 = new Variables(
      null,
      "João Vitor Sampaio",
      "joao5vitorsampaio@hotmail.com",
      "71993263706",
      "86232749545",
      "male",
      "31/07/2001",
      "1234",
      "40715366",
      "Terezinha",
      "Salvador",
      "Bahia",
      "13C"
    );

    projectRepository.saveAll(Arrays.asList(t1));
  }
}
