package souza.charles.sc3005071_p2.model;

import java.time.LocalDate;

public class Aposta {

    private LocalDate momento;
    private String juiz;
    private Apostador jogador1;
    private Apostador jogador2;
    private PedraPapelTesoura jogada1;
    private PedraPapelTesoura jogada2;
    private Apostador ganhador;
    private Premio premio;


    public Aposta(LocalDate momento, String juiz, Apostador jogador1, Apostador jogador2, PedraPapelTesoura jogada1, PedraPapelTesoura jogada2, Apostador ganhador, Premio premio) {
        this.momento = momento;
        this.juiz = juiz;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.jogada1 = jogada1;
        this.jogada2 = jogada2;
        this.ganhador = ganhador;
        this.premio = premio;
    }

    public LocalDate getMomento() {
        return momento;
    }

    public void setMomento(LocalDate momento) {
        this.momento = momento;
    }

    public String getJuiz() {
        return juiz;
    }

    public void setJuiz(String juiz) {
        this.juiz = juiz;
    }

    public Apostador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Apostador jogador1) {
        this.jogador1 = jogador1;
    }

    public Apostador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Apostador jogador2) {
        this.jogador2 = jogador2;
    }

    public PedraPapelTesoura getJogada1() {
        return jogada1;
    }

    public void setJogada1(PedraPapelTesoura jogada1) {
        this.jogada1 = jogada1;
    }

    public PedraPapelTesoura getJogada2() {
        return jogada2;
    }

    public void setJogada2(PedraPapelTesoura jogada2) {
        this.jogada2 = jogada2;
    }

    public Apostador getGanhador() {
        return ganhador;
    }

    public void setGanhador(Apostador ganhador) {
        this.ganhador = ganhador;
    }

    public Premio getPremio() {
        return premio;
    }

    public void setPremio(Premio premio) {
        this.premio = premio;
    }

    public Integer calculoDerrotas(){
        return null;
    }

    public Apostador VencedorPartida(Apostador ganhador, Apostador jogador1, Apostador jogador2, PedraPapelTesoura jogada1, PedraPapelTesoura jogada2) {

        int mao01;
        int mao02;

        //Referencia: https://www.ic.unicamp.br/~edson/disciplinas/mc102/2019-1s/ef/slides/MC102-Aula09.pdf
        //Referencias: https://www.guj.com.br/t/problema-com-jogo-feito-em-java/73624/3
        //Referencias: https://www.youtube.com/watch?v=zzxlmn9gHIk&ab_channel=CanaldoC%C3%B3digo

        //Valor para Empate (mao01 == mao02): null
        //Valor para Pedra: 1
        //Valor para Papel:2
        //Valor para Tesoura: 3

        if (jogada1.toString() != PedraPapelTesoura.TESOURA.toString()) {
            if (jogada1.toString() == PedraPapelTesoura.PAPEL.toString()){
                mao01 = 2;
            }else{
                mao01=1;
            }
        } else {
            mao01 = 3;
        }
        if (jogada2.toString() != PedraPapelTesoura.TESOURA.toString()) {
            if (jogada2.toString() == PedraPapelTesoura.PAPEL.toString()){
                mao02 = 2;
            }else{
                mao02=1;
            }
        } else {
            mao02 = 3;
        }
        if (jogada1.toString() != PedraPapelTesoura.TESOURA.toString()) {
            if (jogada1.toString() == PedraPapelTesoura.PEDRA.toString()){
                mao01 = 1;
            }else{
                mao01=2;
            }
        } else {
            mao01 = 3;
        }
        if (jogada2.toString() != PedraPapelTesoura.TESOURA.toString()) {
            if (jogada2.toString() == PedraPapelTesoura.PEDRA.toString()){
                mao02 = 1;
            }else{
                mao02=2;
            }
        } else {
            mao02 = 3;
        }
        if (jogada1.toString() != PedraPapelTesoura.PEDRA.toString()) {
            if (jogada1.toString() == PedraPapelTesoura.PAPEL.toString()){
                mao01 = 2;
            }else{
                mao01=3;
            }
        } else {
            mao01 = 1;
        }
        if (jogada2.toString() != PedraPapelTesoura.PEDRA.toString()) {
            if (jogada2.toString() == PedraPapelTesoura.PAPEL.toString()){
                mao02 = 2;
            }else{
                mao02=3;
            }
        } else {
            mao02 = 1;
        }
        if (mao01 != mao02) {
            if ((mao01 == 3 && mao02 == 2) || (mao01 == 2 && mao02 == 1) || (mao01 ==1 && mao02 == 3)){
                 ganhador = jogador1;
            } else{
                ganhador = jogador2;
            }
            return ganhador;
        } else {
            return null;
        }
    }

    public Integer quantidadeDeDerrotas(Apostador ganhador){
        int numDerrotas = 10;
            return numDerrotas;
    }

}


