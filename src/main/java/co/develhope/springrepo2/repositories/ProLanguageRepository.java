package co.develhope.springrepo2.repositories;


import co.develhope.springrepo2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-language")
public interface ProLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
