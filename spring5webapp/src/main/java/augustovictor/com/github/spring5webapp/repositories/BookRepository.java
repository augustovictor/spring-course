package augustovictor.com.github.spring5webapp.repositories;

import augustovictor.com.github.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
