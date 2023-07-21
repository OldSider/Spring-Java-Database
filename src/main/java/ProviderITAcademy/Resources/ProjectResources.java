package ProviderITAcademy.Resources;

import ProviderITAcademy.ProjectDomain.Variables;
import ProviderITAcademy.Services.ProjectServices;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin
@RequestMapping("/informations")
public class ProjectResources {

  @Autowired
  private ProjectServices services;

  @CrossOrigin
  @GetMapping("/{id}")
  public ResponseEntity<Variables> findByid(@PathVariable Integer id) {
    Variables obj = services.findById(id);
    return ResponseEntity.ok().body(obj);
  }

  @CrossOrigin
  @GetMapping
  public ResponseEntity<List<Variables>> listAll() {
    List<Variables> list = services.findAll();
    return ResponseEntity.ok().body(list);
  }

  @CrossOrigin
  @PostMapping
  public ResponseEntity<Variables> create(@RequestBody Variables obj) {
    obj = services.create(obj);
    URI uri = ServletUriComponentsBuilder
      .fromCurrentRequest()
      .path("/{id}")
      .buildAndExpand(obj.getId())
      .toUri();
    return ResponseEntity.created(uri).build();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id) {
    services.delete(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping("/{id}")
  public ResponseEntity<Variables> update(
    @PathVariable Integer id,
    @RequestBody Variables obj
  ) {
    Variables newObj = services.update(id, obj);
    return ResponseEntity.ok().body(newObj);
  }
}
