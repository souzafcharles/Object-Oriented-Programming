package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: August 30, 2021
*/
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
