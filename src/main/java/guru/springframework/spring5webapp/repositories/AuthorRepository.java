package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Patrik Holmkvist on 2020-02-05
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
