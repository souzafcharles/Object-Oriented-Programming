package souza.charles.domain.usecases.book;

import souza.charles.domain.entities.book.Book;
import souza.charles.domain.usecases.utils.EntityNotFoundException;

public class RemoveBookUseCase {

    private BookDAO bookDAO;

    public RemoveBookUseCase(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public boolean remove(Integer id){
        if(id == null || bookDAO.findOne(id).isEmpty())
            throw new EntityNotFoundException("Book not found.");
        return bookDAO.deleteByKey(id);
    }

    public boolean remove(Book book){
        if(book == null || bookDAO.findOne(book.getId()).isEmpty())
            throw new EntityNotFoundException("Book not found.");
        return bookDAO.delete(book);
    }
}
