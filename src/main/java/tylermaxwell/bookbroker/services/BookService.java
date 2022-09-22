package tylermaxwell.bookbroker.services;

import org.springframework.stereotype.Service;
import tylermaxwell.bookbroker.models.Book;
import tylermaxwell.bookbroker.repositories.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> allBooks(){
        return repo.findAll();
    }

    public void createBook(Book book) { repo.save(book);
    }

    public Book findBook(Long id) {
        Optional<Book> optionalBook = repo.findById(id);
        return optionalBook.orElse(null);
    }

    public void updateBook(Book book) { repo.save(book);
    }
}
