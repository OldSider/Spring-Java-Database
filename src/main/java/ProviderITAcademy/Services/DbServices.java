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
      "99999999999",
      "99999999999",
      "male",
      "31/07/2001",
      "1234",
      "ZipCode",
      "District",
      "City",
      "State",
      "HouseNumber"
    );

    projectRepository.saveAll(Arrays.asList(t1));
  }
}
