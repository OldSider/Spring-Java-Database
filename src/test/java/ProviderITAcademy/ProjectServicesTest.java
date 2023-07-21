package ProviderITAcademy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import ProviderITAcademy.ProjectDomain.Variables;
import ProviderITAcademy.Repository.ProjectRepository;
import ProviderITAcademy.Services.ObjectNotFound;
import ProviderITAcademy.Services.ProjectServices;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ProjectServicesTest {

  @Mock
  private ProjectRepository repository;

  @InjectMocks
  private ProjectServices services;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testFindById() {
    int id = 1;
    Variables expected = new Variables();
    expected.setId(id);
    when(repository.findById(id)).thenReturn(Optional.of(expected));

    Variables result = services.findById(id);

    assertEquals(expected, result);
  }

  @Test
  void testFindById_ObjectNotFound() {
    int id = 1;
    when(repository.findById(id)).thenReturn(Optional.empty());

    assertThrows(ObjectNotFound.class, () -> services.findById(id));
  }

  @Test
  void testFindAll() {
    List<Variables> expected = Arrays.asList(new Variables(), new Variables());
    when(repository.findAll()).thenReturn(expected);

    List<Variables> result = services.findAll();

    assertEquals(expected, result);
  }

  @Test
  void testCreate() {
    Variables input = new Variables();
    Variables expected = new Variables();
    when(repository.save(any(Variables.class))).thenReturn(expected);

    Variables result = services.create(input);

    assertEquals(expected, result);
  }

  @Test
  void testDelete() {
    int id = 1;

    services.delete(id);

    verify(repository, times(1)).deleteById(id);
  }

  @Test
  void testUpdate() {
    int id = 1;
    Variables input = new Variables();
    Variables existing = new Variables();
    existing.setId(id);
    when(repository.findById(id)).thenReturn(Optional.of(existing));
    when(repository.save(any(Variables.class))).thenReturn(existing);

    Variables result = services.update(id, input);

    assertEquals(existing, result);
  }

  @Test
  void testUpdate_ObjectNotFound() {
    int id = 1;
    Variables input = new Variables();
    when(repository.findById(id)).thenReturn(Optional.empty());

    assertThrows(ObjectNotFound.class, () -> services.update(id, input));
  }
}
