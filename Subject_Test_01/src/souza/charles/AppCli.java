package souza.charles;

import java.util.*;

public class AppCli {

    private static Scanner scanner = new Scanner(System.in);
    private static GenericDAO<String, Cientista> conexaoDAO = new CientistaDAO();

    public static void executar() throws MinhasExcecoes { //assinatura de exceção no principal

        while (true){
            int opcao = coletarOpcaoCientista();
            switch (opcao){
                case 1:
                    inserirCientista();
                    break;
                case 2:
                    atualizarCientista();
                    break;
                case 3:
                    removerCientista();
                    break;
                case 4:
                    listarCientista();
                    break;
                case 5:
                    listarTodosCientistas();
                    break;
                case 0:
                    sair();
                    return;
                default:
                    continue;
            }
        }
    }

    private static int coletarOpcaoCientista() throws MinhasExcecoes { //assinatura de exceção no principal
        System.out.println("\nDigite uma das opções: ");
        System.out.println("1 - Adicionar Cientista");
        System.out.println("2 - Atualizar Cientista");
        System.out.println("3 - Remover Cientista");
        System.out.println("4 - Listar Cientista");
        System.out.println("5 - Listar Todos Cientista");
        System.out.println("0 - Sair");
        System.out.println(">>> ");

        Integer opcao = 0;
        try {                                             //Tratamento de Exceção
            opcao = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw (new MinhasExcecoes("Opção inválida!"));
        }
        return opcao;
    }

    private static void inserirCientista() {

        System.out.println("\nInsira os dados do Cientista: ");
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Cientista resultado = conexaoDAO.findOne(cpf);

        if(resultado != null) {
            System.out.println("Atenção! Cientista CPF " + cpf + " já esta cadastrado!");
            System.out.println("\n");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Área de Atuação: ");
        String areaAtuacao = scanner.nextLine();
        System.out.print("Instituição de Trabalho: ");
        String instituicaoTrabalho = scanner.nextLine();
        System.out.print("Número de Artigos Publicados: ");
        Integer numeroArtigos = Integer.valueOf(scanner.nextLine());
        System.out.print("Número de Contribuição Científica: ");
        Integer numeroContribuicao = Integer.valueOf(scanner.nextLine());
        System.out.print("Orientador [CPF]: ");
        String cpfCientistaTitular = scanner.nextLine();

        if(cpfCientistaTitular == null) {
            System.out.println("Atenção! CPF do Orientador (" + cpf + ") não encontrado!");
            System.out.println("\n");
            return;
        }

        Cientista cientistaTitular = conexaoDAO.findOne(cpfCientistaTitular);
        if(cientistaTitular instanceof Pesquisador){
            cientistaTitular = promoverCientista((Pesquisador) cientistaTitular);
        }

        Cientista novoCientista = new Pesquisador(cpf, nome, areaAtuacao, instituicaoTrabalho, numeroArtigos,numeroContribuicao, (Orientador) cientistaTitular);

        conexaoDAO.insert(novoCientista);
    }

    private static void atualizarCientista() {
        System.out.println("\nInsira os novos dados do Cientista: ");
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Cientista resultado = conexaoDAO.findOne(cpf);
        if(resultado == null) {
            System.out.println("Atenção! Cientista CPF " + cpf + " não encontrado!");
            System.out.println("\n");
            return;
        }
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Área de Atuação: ");
        String areaAtuacao = scanner.nextLine();
        System.out.print("Instituição de Trabalho: ");
        String instituicaoTrabalho = scanner.nextLine();
        System.out.print("Número de Artigos Publicados: ");
        Integer numeroArtigos = Integer.valueOf(scanner.nextLine());
        System.out.print("Número de Contribuição Científica: ");
        Integer numeroContribuicao = Integer.valueOf(scanner.nextLine());
        System.out.print("Orientador [CPF]: ");
        String cpfCientistaTitular = scanner.nextLine();

        if(cpfCientistaTitular == null) {
            System.out.println("CPF do orientador (" + cpf + ") não encontrado!");
            System.out.println("\n");
            return;
        }

        Cientista cientistaTitular = conexaoDAO.findOne(cpfCientistaTitular);
        if(cientistaTitular instanceof Pesquisador){
            cientistaTitular = promoverCientista((Pesquisador) cientistaTitular);
        }

        resultado.setNome(nome);
        resultado.setAreaAtuacao(areaAtuacao);
        resultado.setInstituicaoTrabalho(instituicaoTrabalho);
        resultado.setNumeroArtigos(numeroArtigos);
        resultado.setNumeroContribuicao(numeroContribuicao);
        resultado.setOrientadorResponsavel((Orientador) cientistaTitular);

        conexaoDAO.update(resultado);

    }

    private static void removerCientista() {
        System.out.println("\nDigite o CPF do Cientista: ");
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Cientista resultado = conexaoDAO.findOne(cpf);

        if(resultado == null) {
            System.out.println("Cientista CPF " + cpf + " não encontrado!");
            System.out.println("\n");
            return;
        }

        if(resultado instanceof Orientador) {
            promoverOrientados((Orientador) resultado);
        }
        conexaoDAO.remove(cpf);
        System.out.println("Cientista CPF: " + cpf + " removido!");

        System.out.println("\n");

    }

    private static void listarCientista() {
        System.out.println("\nDigite o CPF do Cientista: ");
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Optional<Cientista> resultado = Optional.ofNullable(conexaoDAO.findOne(cpf));              //Optional
        if(resultado != null) {
            System.out.println(resultado);
        }
        System.out.println("\n");
    }

    private static void listarTodosCientistas() {
        List<Cientista> resultado = conexaoDAO.findAll();
        for (Cientista cientista : resultado) {
            System.out.println(cientista);

        }
        System.out.println("\n");
    }

    private static void sair() {
        System.out.println("Fim do Programa! Volte mais vezes!");
    }

    private static Cientista promoverCientista(Pesquisador pesquisador) {
        Cientista promovidoPesquisador = new Orientador(pesquisador);
        conexaoDAO.update(promovidoPesquisador);
        return promovidoPesquisador;
    }

    private static void promoverOrientados(Orientador orientador) {
        Iterator<Cientista> iterator = orientador.iterator();
        while (iterator.hasNext()){
            Cientista orientado = iterator.next();
            Orientador orientadorResponsavel = orientador.getOrientadorResponsavel();

            orientado.setOrientadorResponsavel(orientadorResponsavel);
            if(orientadorResponsavel != null) {
                orientadorResponsavel.addOrientado(orientado);
            }
        }
    }
}