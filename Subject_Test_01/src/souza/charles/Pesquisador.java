package souza.charles;

public class Pesquisador extends Cientista{

    public Pesquisador(String cpf, String nome, String areaAtuacao, String instituicaoTrabalho, Integer numeroArtigos, Integer numeroContribuicao, Orientador orientadorResponsavel) {
        super(cpf, nome, areaAtuacao, instituicaoTrabalho, numeroArtigos, numeroContribuicao, orientadorResponsavel);
    }

    @Override
    public Integer calculaIndicadores() {
        int indicadores = getNumeroArtigos() + getNumeroContribuicao();
        return indicadores;
    }
}