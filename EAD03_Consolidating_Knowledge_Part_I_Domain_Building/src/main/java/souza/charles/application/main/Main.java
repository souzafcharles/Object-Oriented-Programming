package souza.charles.application.main;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: 03 November, 2021
*/

import souza.charles.application.repository.InMemoryBookDAO;
import souza.charles.application.repository.InMemoryTransactionDAO;
import souza.charles.application.repository.InMemoryUserDAO;
import souza.charles.domain.entities.book.Book;
import souza.charles.domain.entities.book.BookGenre;
import souza.charles.domain.entities.book.BookStatus;
import souza.charles.domain.entities.transaction.Transaction;
import souza.charles.domain.entities.user.Faculty;
import souza.charles.domain.entities.user.Student;
import souza.charles.domain.entities.user.User;
import souza.charles.domain.usecases.book.*;
import souza.charles.domain.usecases.transaction.*;
import souza.charles.domain.usecases.user.*;

public class Main {

    private static CreateBookUseCase createBookUseCase;
    private static FindBookUseCase findBookUseCase;
    private static UpdateBookUseCase updateBookUseCase;
    private static RemoveBookUseCase removeBookUseCase;

    private static CreateUserUseCase createUserUseCase;
    private static FindUserUseCase findUserUseCase;
    private static UpdateUserUseCase updateUserUseCase;
    private static RemoveUserUseCase removeUserUseCase;

    private static CheckoutTransactionUseCase checkoutTransactionUseCase;
    private static ReturnTransactionUseCase returnTransactionUseCase;
    private static FindTransactionUseCase findTransactionUseCase;

    private static CreateTransactionReportUseCase createTransactionReportUseCase;


    public static void main(String[] args) {
        configureInjection();

        User user1 = new Student("SC0000001", "Charles de Souza", "charles@email.com", "16 99999 8888", "System Analysis and Development" );
        User user2 = new Faculty("SC0000002", "Sharlene de Souza", "sharlene@email.com", "16 9999 7777", "Computer Systems" );
        createUserUseCase.insert(user1);
        createUserUseCase.insert(user2);

        Book book1 = new Book(1, 300, "Head First Design Patterns: A Brain-Friendly Guide", "Eric Freeman", "O'Reilly Media", "9780596007126", BookGenre.TECHNICAL, BookStatus.AVAILABLE);
        Book book2 = new Book(4, 203, "\"Hello, World!\": The History of Programming", "James Steinberg", "CreateSpace Independent Publishing", "1481277154", BookGenre.HISTORY, BookStatus.AVAILABLE);
        Book book3 = new Book(2, 132, "The Chaos Kind", "Barry Eisler", "Thomas & Mercer", " 1542005590", BookGenre.ACTION, BookStatus.AVAILABLE);
        Book book4 = new Book(3, 342, "The Shining ", "Stephen King", "Hodder & Stoughton", " 9781444720723", BookGenre.HORROR, BookStatus.AVAILABLE);
        Book book5 = new Book(4, 233, "On the Origin of Species", "Charles Darwin", "Cambridge University Press", "9781316610206", BookGenre.SCIENCE, BookStatus.AVAILABLE);
        Book book6 = new Book(5, 99, "Macbeth", "William Shakespeare", "Penguin Publishing Group", "9780698410732", BookGenre.DRAMA, BookStatus.AVAILABLE);

        Integer b1 = createBookUseCase.insert(book1);
        Integer b2 = createBookUseCase.insert(book2);
        Integer b3 = createBookUseCase.insert(book3);
        Integer b4 = createBookUseCase.insert(book4);
        Integer b5 = createBookUseCase.insert(book5);
        Integer b6 = createBookUseCase.insert(book6);

        checkoutBook(user1.getInstitutionalId(), b1);
        checkoutBook(user1.getInstitutionalId(), b2);
        checkoutBook(user1.getInstitutionalId(), b3);
        checkoutBook(user1.getInstitutionalId(), b4);
        checkoutBook(user1.getInstitutionalId(), b5);
        checkoutBook(user1.getInstitutionalId(), b6);
        checkoutBook(user2.getInstitutionalId(), b1);
        checkoutBook(user2.getInstitutionalId(), b2);
        checkoutBook(user2.getInstitutionalId(), b3);
        checkoutBook(user2.getInstitutionalId(), b4);
        checkoutBook(user2.getInstitutionalId(), b5);
        checkoutBook(user2.getInstitutionalId(), b6);

        returnBook(b1);
        returnBook(b2);
        returnBook(b3);
        returnBook(b4);
        returnBook(b5);
        returnBook(b6);

        findTransactionUseCase.findAll().stream().forEach(transaction -> System.out.println(transaction));

    }

    public static void checkoutBook(String userId, Integer bookId){
        try{
            checkoutTransactionUseCase.checkoutABook(userId, bookId);
            System.out.println("Book has been checked out");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }


    public static void returnBook(Integer bookId){
        try{
            returnTransactionUseCase.returnBook(bookId);
            System.out.println("Book has been returned");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private static void configureInjection() {
        BookDAO bookDAO = new InMemoryBookDAO();
        createBookUseCase = new CreateBookUseCase(bookDAO);
        updateBookUseCase = new UpdateBookUseCase(bookDAO);
        findBookUseCase = new FindBookUseCase(bookDAO);
        removeBookUseCase = new RemoveBookUseCase(bookDAO);

        UserDAO userDAO = new InMemoryUserDAO();
        createUserUseCase = new CreateUserUseCase(userDAO);
        updateUserUseCase = new UpdateUserUseCase(userDAO);
        findUserUseCase = new FindUserUseCase(userDAO);
        removeUserUseCase = new RemoveUserUseCase(userDAO);

        TransactionDAO transactionDAO = new InMemoryTransactionDAO();
        checkoutTransactionUseCase = new CheckoutTransactionUseCase(
                transactionDAO, findUserUseCase, findBookUseCase, updateUserUseCase, updateBookUseCase);
        returnTransactionUseCase = new ReturnTransactionUseCase(
                transactionDAO, findUserUseCase, findBookUseCase, updateUserUseCase, updateBookUseCase);
        findTransactionUseCase = new FindTransactionUseCase(transactionDAO);

    }

    public static void report(Integer id, Transaction transaction){
        try{
            createTransactionReportUseCase.report(transaction.getId(), transaction);
            System.out.println("The report has create.");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
