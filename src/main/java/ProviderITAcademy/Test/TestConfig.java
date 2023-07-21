package ProviderITAcademy.Test;

import ProviderITAcademy.Services.DbServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

  @Autowired
  private DbServices dbServices;

  @Bean
  public boolean instance() {
    this.dbServices.instance();
    return true;
  }
}
