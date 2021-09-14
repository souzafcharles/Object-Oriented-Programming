package souza.charles;

import java.time.LocalDate;

public class Post {
    private String quote;
    private LocalDate date;
    private int claps;
    private int boos;
    private UserAccount user;

    public Post(String quote, UserAccount user) {
        this.quote = quote;
        this.user = user;
        this.date = LocalDate.now();
    }

    public String getAsString(){
        return "[" + date + "]" + user.getUserName() + " says \"" + quote + "\" | Claps: " + claps + "| Boos: " + boos;
    }

    public void clap () {
        claps++;
    }

    public void boo() {
        boos++;
    }
}
