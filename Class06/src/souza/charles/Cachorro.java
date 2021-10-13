package souza.charles;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, String raca){
        this.raca = raca;
        setNome(nome);
        setFamilia("Canídeo");
    }

    public void latir() {
        System.out.println("Au Au Au!");
    }

    @Override
    public void brincar(){
        System.out.println(getNome() + " está brincando de correr atrás do gato");
    }
}
