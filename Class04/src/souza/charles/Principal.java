package souza.charles;

public class Principal {
    public static void main(String[] args) {
        //cria um personagem do desenho
        Personagem simpson = new Personagem("Homer Simpson", 45);

        //crio um dublador de personagem
        Dublador dubl = new Dublador("Carlos A. Vasconcellos", 555);

        //agora que há um personagem e um dublador, posso fazer a associação
        simpson.setDublador(dubl);
        dubl.setPersonagem(simpson);

        //agora o objeto simpson tem uma referência para o objeto dubl e vice-versa
        //imprime o nome do dublador do objeto simpson: simpson -> dubl -> [atributo] nome
        System.out.println(simpson.getDublador().nome);
    }
}
