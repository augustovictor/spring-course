package augustovictor.com.github.spring5webapp.controller;

import augustovictor.com.github.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Tells spring it is a spring bean so it will be a spring managed component
public class BookController {

    BookRepository bookRepository;

    public BookController(BookRepository bookRepository) { // Spring will autowire this repository automatically
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) { // Spring will pass in the model
        model.addAttribute("books", bookRepository.findAll()); // bookRepository is using spring data JPA that uses hibernate
        return "books"; // SpringMVC will associate this with a view called "books"
    }
}
