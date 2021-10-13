package souza.charles;

public class Principal {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro("Pluto", "Vira Lara");
        Gato gatuno = new Gato("Balthazar", true);

        gatuno.brincar();
        gatuno.miar();

        dog.brincar();
        dog.latir();

        System.out.println(gatuno);
    }
}
