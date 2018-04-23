package augustovictor.com.github.spring5webapp.bootstrap;

import augustovictor.com.github.spring5webapp.model.Author;
import augustovictor.com.github.spring5webapp.model.Book;
import augustovictor.com.github.spring5webapp.model.Publisher;
import augustovictor.com.github.spring5webapp.repositories.AuthorRepository;
import augustovictor.com.github.spring5webapp.repositories.BookRepository;
import augustovictor.com.github.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher p1 = new Publisher("P1");
        publisherRepository.save(p1);

        Author a1 = new Author("A1 name", "A1 last name");
        Book b1 = new Book("B1", "isbn1", p1);
        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        bookRepository.save(b1);

        Author a2 = new Author("A2 name", "A2 last name");
        Book b2 = new Book("B2", "isbn2", p1);
        a2.getBooks().add(b2);

        authorRepository.save(a2);
        bookRepository.save(b2);

    }
}
