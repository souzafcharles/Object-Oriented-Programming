package souza.charles.domain.usecases.book;

import souza.charles.domain.entities.book.Book;
import souza.charles.domain.usecases.utils.DAO;

import java.util.Optional;

public interface BookDAO extends DAO<Book, Integer> {
    Optional<Book> findByIsnb(String isbn);
}
