package souza.charles.sc3005071_p2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Apostador {
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;
    private boolean interditado;

    private List<Aposta> apostas = new ArrayList<>();

    public Apostador(String nome, String cpf, String telefone, int idade, boolean interditado) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
        this.interditado = interditado;
    }

    public Apostador() {

    }


    public abstract Integer calculaDivorcios();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isInterditado() {
        return interditado;
    }

    public void setInterditado(boolean interditado) {
        this.interditado = interditado;
    }

    @Override
    public String toString() {
        return "Apostador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", interditado=" + interditado +
                ", apostas=" + apostas +
                '}';
    }
}
