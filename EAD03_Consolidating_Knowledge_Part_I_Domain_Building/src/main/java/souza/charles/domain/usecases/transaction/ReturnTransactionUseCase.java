package souza.charles.domain.usecases.transaction;

import souza.charles.domain.entities.book.Book;
import souza.charles.domain.entities.book.BookStatus;
import souza.charles.domain.entities.transaction.Transaction;
import souza.charles.domain.entities.user.User;
import souza.charles.domain.usecases.book.FindBookUseCase;
import souza.charles.domain.usecases.book.UpdateBookUseCase;
import souza.charles.domain.usecases.user.FindUserUseCase;
import souza.charles.domain.usecases.user.UpdateUserUseCase;
import souza.charles.domain.usecases.utils.EntityNotFoundException;

import java.time.LocalDate;

public class ReturnTransactionUseCase {


    private TransactionDAO transactionDAO;
    private FindUserUseCase findUserUseCase;
    private FindBookUseCase findBookUseCase;
    private UpdateUserUseCase updateUserUseCase;
    private UpdateBookUseCase updateBookUseCase;

    public ReturnTransactionUseCase(
            TransactionDAO transactionDAO,
            FindUserUseCase findUserUseCase,
            FindBookUseCase findBookUseCase,
            UpdateUserUseCase updateUserUseCase,
            UpdateBookUseCase updateBookUseCase) {

        this.transactionDAO = transactionDAO;
        this.findUserUseCase = findUserUseCase;
        this.findBookUseCase = findBookUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.updateBookUseCase = updateBookUseCase;
    }

    public void returnBook(Integer bookId){
        if (bookId == null)
            throw new IllegalArgumentException("Book ID is null");

        Transaction transaction = transactionDAO.findTransactionByBookId(bookId)
                .orElseThrow(() -> new EntityNotFoundException("Can not find an open transaction for book ID " + bookId));

        transaction.setReturnDate(LocalDate.now());
        transactionDAO.update(transaction);

        Book book = findBookUseCase.findOne(bookId).get();
        book.setStatus(BookStatus.AVAILABLE);
        updateBookUseCase.update(book);

        String userId = transaction.getUser().getInstitutionalId();
        User user = findUserUseCase.findOne(userId).get();
        user.decreaseNumberOfBooksCheckedOut();
        updateUserUseCase.update(user);
    }
}
