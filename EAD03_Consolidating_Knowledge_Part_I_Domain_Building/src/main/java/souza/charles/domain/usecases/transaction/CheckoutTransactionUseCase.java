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

public class CheckoutTransactionUseCase {

    private TransactionDAO transactionDAO;
    private FindUserUseCase findUserUseCase;
    private FindBookUseCase findBookUseCase;
    private UpdateUserUseCase updateUserUseCase;
    private UpdateBookUseCase updateBookUseCase;

    public CheckoutTransactionUseCase(
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

    public Transaction checkoutABook(String userId, Integer bookId){
        if (userId == null || bookId == null)
            throw new IllegalArgumentException("User ID and/or Book ID are/is null");

        Book book = findBookUseCase.findOne(bookId)
                .orElseThrow(() -> new EntityNotFoundException("Can not find a book with id " + bookId));

        User user = findUserUseCase.findOne(userId)
                .orElseThrow(() -> new EntityNotFoundException("Can not find a user with id " + userId));

        if(book.getStatus() == BookStatus.CHECKED_OUT)
            throw new TransactionNotAllowedException("The book with ID " + bookId + " is unavailable");

        if (!user.isAbleToCheckOut())
            throw new TransactionNotAllowedException("The user with ID " + userId + " exceeded the check out limit.");

        Transaction checkoutTransaction = new Transaction(book, user, user.getCheckoutTimeLimitInDays());
        Integer transactionID = transactionDAO.create(checkoutTransaction);

        book.setStatus(BookStatus.CHECKED_OUT);
        updateBookUseCase.update(book);

        user.increaseNumberOfBooksCheckedOut();
        updateUserUseCase.update(user);

        return transactionDAO.findOne(transactionID).get();
    }
}