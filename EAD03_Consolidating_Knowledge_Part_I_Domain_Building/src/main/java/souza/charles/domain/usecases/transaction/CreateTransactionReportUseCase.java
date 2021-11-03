package souza.charles.domain.usecases.transaction;

import souza.charles.domain.entities.transaction.Transaction;
import souza.charles.domain.usecases.utils.EntityNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Optional;


public class CreateTransactionReportUseCase {

    private TransactionDAO transactionDAO;

    public CreateTransactionReportUseCase(TransactionDAO transactionDAO) {
        this.transactionDAO = transactionDAO;
    }

    public Optional<Transaction> findOne(Integer id) {

        Transaction transaction = transactionDAO.findOne(id)
                .orElseThrow(() -> new EntityNotFoundException("Can not find an open transaction " + id));

        transaction.setReturnDate(LocalDate.now());
        transactionDAO.update(transaction);

        if (id == null)
            throw new IllegalArgumentException("ID can not be null.");
        return transactionDAO.findOne(id);
    }

    public static boolean report(Integer id, Transaction transaction){

        try {
            FileWriter reportTransaction = new FileWriter(String.valueOf(id));
            PrintWriter generateReport = new PrintWriter(reportTransaction);
            generateReport.println(transaction);
            generateReport.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

