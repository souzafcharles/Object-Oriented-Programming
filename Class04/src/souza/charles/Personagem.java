package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: August 30, 2021
*/
public class Personagem {
    String nome;
    int idade;
    Dublador dublador;

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Dublador getDublador(){
        return dublador;
    }

    public void setDublador(Dublador dublador){
        this.dublador = dublador;
    }

}
