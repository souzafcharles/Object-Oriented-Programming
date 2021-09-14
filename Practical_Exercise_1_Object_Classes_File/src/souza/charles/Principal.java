package souza.charles;

public class Principal {

    public static void main(String[] args) {

        UserAccount charles = new UserAccount("charles@charles.com", "charlescharles");

        charles.post("Hora do café!");
        charles.booPost(0);
        charles.clapPost(1);

        System.out.println(charles.getPostAsString());

    }
}
