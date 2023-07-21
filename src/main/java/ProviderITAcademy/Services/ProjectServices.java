package ProviderITAcademy.Services;

import ProviderITAcademy.ProjectDomain.Variables;
import ProviderITAcademy.Repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServices {

  @Autowired
  private ProjectRepository repository;

  public Variables findById(Integer id) {
    Optional<Variables> obj = repository.findById(id);
    return obj.orElseThrow(() ->
      new ObjectNotFound(
        "Objeto não encontrado! id:" +
        id +
        ", Tipo: " +
        Variables.class.getName()
      )
    );
  }

  public List<Variables> findAll() {
    List<Variables> list = repository.findAll();
    return list;
  }

  public Variables create(Variables obj) {
    obj.setId(null);
    return repository.save(obj);
  }

  public void delete(Integer id) {
    repository.deleteById(id);
  }

  public Variables update(Integer id, Variables obj) {
    Variables newObj = findById(id);
    newObj.setFullName(obj.getFullName());
    newObj.setEmail(obj.getEmail());
    newObj.setUserPhone(obj.getUserPhone());
    newObj.setUserId(obj.getUserId());
    newObj.setGender(obj.getGender());
    newObj.setBirth(obj.getBirth());
    newObj.setUserPassword(obj.getUserPassword());
    newObj.setUserZipCode(obj.getUserZipCode());
    newObj.setUserDistrict(obj.getUserDistrict());
    newObj.setUserState(obj.getUserState());
    newObj.setUserCity(obj.getUserCity());
    newObj.setUserHouseNumber(obj.getUserHouseNumber());
    return repository.save(newObj);
  }
}
