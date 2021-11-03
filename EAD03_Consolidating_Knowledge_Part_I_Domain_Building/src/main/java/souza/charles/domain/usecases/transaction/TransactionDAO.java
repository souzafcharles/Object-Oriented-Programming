package souza.charles.domain.usecases.transaction;

import souza.charles.domain.entities.book.Book;
import souza.charles.domain.entities.transaction.Transaction;
import souza.charles.domain.usecases.utils.DAO;

import java.util.Optional;

public interface TransactionDAO extends DAO<Transaction, Integer> {
    Optional<Transaction> findTransactionByBookId(Integer id);
}