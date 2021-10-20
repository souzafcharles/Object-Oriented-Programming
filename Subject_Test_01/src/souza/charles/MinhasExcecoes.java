package souza.charles;

public class MinhasExcecoes extends Exception{

    public MinhasExcecoes(String message) {
        super("ATENÇÃO: " + message);
    }
}
