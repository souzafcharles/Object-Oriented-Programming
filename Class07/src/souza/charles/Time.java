package souza.charles;

import java.util.Objects;

public class Time{

    private String nome, cidade;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String toString() {
        return "["+ nome + ", " + cidade + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return nome.equals(time.nome) && cidade.equals(time.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cidade);
    }
}