package souza.charles.sc3005071_p2.model;

import java.util.Arrays;

public enum PedraPapelTesoura {

    PEDRA ("Pedra"),
    PAPEL ("Papel"),
    TESOURA ("Tesoura");

    private String jogada1e2;

    PedraPapelTesoura(String jogada1e2){
        this.jogada1e2 = jogada1e2;
    }

    @Override
    public String toString() {
        return jogada1e2;
    }

    public static PedraPapelTesoura toEnum(String value) {
        return Arrays.stream(PedraPapelTesoura.values())
                .filter(a -> value.equals(a.toString()))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}
