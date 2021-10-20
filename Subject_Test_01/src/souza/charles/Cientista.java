package souza.charles;

import java.util.Objects;

public abstract class Cientista {
    private String cpf;
    private String nome;
    private String areaAtuacao;
    private String instituicaoTrabalho;
    private Integer numeroArtigos;
    private Integer  numeroContribuicao;
    private Orientador orientadorResponsavel;

    public Cientista(String cpf, String nome, String areaAtuacao, String instituicaoTrabalho, Integer numeroArtigos, Integer numeroContribuicao, Orientador orientadorResponsavel) {
        this.cpf = cpf;
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
        this.instituicaoTrabalho = instituicaoTrabalho;
        this.numeroArtigos = numeroArtigos;
        this.numeroContribuicao = numeroContribuicao;
        if (orientadorResponsavel != null) {
            this.orientadorResponsavel = orientadorResponsavel;
            this.orientadorResponsavel.addOrientado(this);
        }
    }

    public abstract Integer calculaIndicadores();

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getInstituicaoTrabalho() {
        return instituicaoTrabalho;
    }

    public void setInstituicaoTrabalho(String instituicaoTrabalho) {
        this.instituicaoTrabalho = instituicaoTrabalho;
    }

    public Integer getNumeroArtigos() {
        return numeroArtigos;
    }

    public void setNumeroArtigos(Integer numeroArtigos) {
        this.numeroArtigos = numeroArtigos;
    }

    public Integer getNumeroContribuicao() {
        return numeroContribuicao;
    }

    public void setNumeroContribuicao(Integer numeroContribuicao) {
        this.numeroContribuicao = numeroContribuicao;
    }

    public Orientador getOrientadorResponsavel() {
        return orientadorResponsavel;
    }

    public void setOrientadorResponsavel(Orientador orientadorResponsavel) {
        this.orientadorResponsavel = orientadorResponsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cientista cientista = (Cientista) o;
        return cpf.equals(cientista.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Categoria: " + getClass().getSimpleName()
                + " | CPF: " + cpf
                + " | Nome: " + nome
                + " | Área de Atuação: " + areaAtuacao
                + " | Instituição de Trabalho: " + instituicaoTrabalho
                + " | Número de Artigos Publicados: " + numeroArtigos
                + " | Número de Contribuição Científica: " + numeroContribuicao
                + " | Indicadores de Producão Científica: " + calculaIndicadores() //rastro científico
                + " | Orientador Responsável: " + (orientadorResponsavel != null ? orientadorResponsavel.getNome(): "Vazio")
                + "| ";
    }
}