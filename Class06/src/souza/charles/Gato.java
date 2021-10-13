package souza.charles;

public class Gato extends Mamifero{
    private boolean unhaAfiada;

    public Gato(String nome, boolean unha){
        unhaAfiada = unha;
        setNome(nome);
        setFamilia("Felino");
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + " | Família: " + getFamilia() +
                " | Unha Afiada: " + (unhaAfiada? "Sim" : "Não");
    }

    public void miar() {
        System.out.println("Miau Miau!");
    }

}
