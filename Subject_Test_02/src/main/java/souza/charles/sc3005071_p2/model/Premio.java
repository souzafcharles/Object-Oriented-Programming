package souza.charles.sc3005071_p2.model;

public class Premio {
    private String nome;
    private Double valorDeclarado;
    private boolean itemDeFamilia;

    public Premio(String nome, Double valorDeclarado, boolean itemDeFamilia) {
        this.nome = nome;
        this.valorDeclarado = valorDeclarado;
        this.itemDeFamilia = itemDeFamilia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public boolean isItemDeFamilia() {
        return itemDeFamilia;
    }

    public void setItemDeFamilia(boolean itemDeFamilia) {
        this.itemDeFamilia = itemDeFamilia;
    }
}
