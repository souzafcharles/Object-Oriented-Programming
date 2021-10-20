package souza.charles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Orientador extends Cientista{

    List<Cientista> orientados = new ArrayList<>();

    public Orientador(String cpf, String nome, String areaAtuacao, String instituicaoTrabalho, Integer numeroArtigos, Integer numeroContribuicao, Orientador orientadorResponsavel) {
        super(cpf, nome, areaAtuacao, instituicaoTrabalho, numeroArtigos, numeroContribuicao, orientadorResponsavel);
    }

    @Override
    public Integer calculaIndicadores() { // traço científico: a produção do orientados também somam ao do orientador
        int indicadores = getNumeroArtigos() + getNumeroContribuicao();
        for (Cientista orientado : orientados) {
            indicadores += orientado.calculaIndicadores();
        }
        return indicadores;
    }

    public void addOrientado(Cientista c){
        orientados.add(c);
    }

    public int numDeOrientados(){
        return orientados.size();
    }

    public Iterator<Cientista> iterator(){
        return orientados.iterator();
    }

    @Override
    public String toString() {
        return super.toString()
                + " Orientados: " + numDeOrientados();
    }

    public Orientador(Pesquisador pesquisador) {
        this(pesquisador.getCpf(),
                pesquisador.getNome(),
                pesquisador.getAreaAtuacao(),
                pesquisador.getInstituicaoTrabalho(),
                pesquisador.getNumeroArtigos(),
                pesquisador.getNumeroArtigos(),
                pesquisador.getOrientadorResponsavel());
    }
}