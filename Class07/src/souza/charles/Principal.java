package souza.charles;

import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {

        Campeonato campeonato = new Campeonato();
        campeonato.addTime(new Time("Ferroviária", "Araraquara"));
        campeonato.addTime(new Time("Palmeiras", "São Paulo"));
        campeonato.addTime(new Time("Santos", "Santos"));
        campeonato.addTime(new Time("Bragantino", "Bragança Paulista"));

        Iterator<Time> iterator = campeonato.iteratorTime();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
