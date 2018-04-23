package augustovictor.com.github.spring5webapp.repositories;

import augustovictor.com.github.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
