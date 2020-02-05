package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Patrik Holmkvist on 2020-02-05
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
