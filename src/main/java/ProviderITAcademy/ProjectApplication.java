package ProviderITAcademy;

import ProviderITAcademy.Services.DbServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class ProjectApplication implements CommandLineRunner {

  @Autowired
  private DbServices dbServices;

  public static void main(String[] args) {
    SpringApplication.run(ProjectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    dbServices.instance();
  }
}
