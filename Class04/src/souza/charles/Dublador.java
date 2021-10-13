package souza.charles;

public class Dublador {
    String nome;
    int registroProfissional;
    Personagem personagem;

    public Dublador(String nome, int registroProfissional) {
        this.nome = nome;
        this.registroProfissional = registroProfissional;
    }

    public Personagem getPersonagem(){
        return personagem;
    }

    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
}
