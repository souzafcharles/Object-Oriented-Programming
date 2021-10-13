package souza.charles;

public class Mamifero {
    private String nome;
    private String familia;

    public void brincar(){
        System.out.println(nome + " está brincando…");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFamilia() {
        return familia;
    }
    public void setFamilia(String familia) {
        this.familia = familia;
    }

}
