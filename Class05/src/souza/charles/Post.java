package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: September 13, 2021
*/
import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private int claps;
    private int boos;

    private UserAccount user;

    public Post(UserAccount account, String quote) {
        this.quote = quote;
        this.date = LocalDate.now();
        user = account;
    }

    public String show(){
        return "[" + date + "]" + user.getUserName() + " says \"" + quote + "\" | Claps: " + claps + "| Boos: " + boos;
    }

    public void clap () {
        claps++;
    }

    public void boo() {
        boos++;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getClaps() {
        return claps;
    }

    public int getBoos() {
        return boos;
    }

    public LocalDate getDate() {
        return date;
    }

    public UserAccount getUser() {
        return user;
    }
}
