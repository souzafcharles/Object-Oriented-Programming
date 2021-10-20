package souza.charles;

public class Principal {
    
    public static void main(String[] args) throws MinhasExcecoes {
        preencherBanco();
        AppCli.executar();
    }

    private static void preencherBanco() {

        GenericDAO<String, Cientista> conexaoDAO = new CientistaDAO();

        Orientador newton = new Orientador("16431727164", "Isaac Newton", "Matemática", "University of Cambridge", 30, 100, null);
        Orientador einstein = new Orientador("18791955187", "Albert Einstein", "Física", "University of Zurich", 319, 55, newton);
        Orientador curie = new Orientador("18671934186", "Marie Curie", "Físico-Química", "University of Paris", 219, 45, newton);
        Orientador darwin = new Orientador("18091882180", "Charles Darwin","Biologia", "University of Edinburgh", 119, 35, einstein);

        Pesquisador hawking = new Pesquisador("19422018194", "Stephen Hawking", "Física", "California Institute of Technology", 300, 60, darwin);
        Pesquisador pasteur = new Pesquisador("18221895182", "Louis Pasteur", "Bioquímica", " University of Strasbourg", 350, 98, darwin);
        Pesquisador tesla = new Pesquisador("18561943185", "Nikola Tesla", "Engenharia Elétrica","Graz University of Technology", 15, 10, curie);

        conexaoDAO.insert(newton);
        conexaoDAO.insert(einstein);
        conexaoDAO.insert(curie);
        conexaoDAO.insert(darwin);
        conexaoDAO.insert(hawking);
        conexaoDAO.insert(pasteur);
        conexaoDAO.insert(tesla);
    }
}
