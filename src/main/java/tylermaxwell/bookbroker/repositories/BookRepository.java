package tylermaxwell.bookbroker.repositories;

import org.springframework.data.repository.CrudRepository;
import tylermaxwell.bookbroker.models.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
