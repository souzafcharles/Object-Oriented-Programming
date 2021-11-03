package souza.charles.domain.usecases.book;

import souza.charles.domain.entities.book.Book;
import souza.charles.domain.usecases.utils.EntityAlreadyExistsException;
import souza.charles.domain.usecases.utils.EntityNotFoundException;
import souza.charles.domain.usecases.utils.Notification;
import souza.charles.domain.usecases.utils.Validator;

public class UpdateBookUseCase {
    private BookDAO bookDAO;

    public UpdateBookUseCase(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public boolean update(Book book){
        Validator<Book> validator = new BookInputRequestValidator();
        Notification notification = validator.validate(book);

        if(notification.hasErros())
            throw new IllegalArgumentException(notification.errorMessage());

        Integer id = book.getId();
        if(bookDAO.findOne(id).isEmpty())
            throw new EntityNotFoundException("Book not found.");

        return bookDAO.update(book);
    }
}
