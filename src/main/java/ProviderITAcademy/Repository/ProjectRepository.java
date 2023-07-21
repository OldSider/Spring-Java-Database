package ProviderITAcademy.Repository;

import ProviderITAcademy.ProjectDomain.Variables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Variables, Integer> {}
