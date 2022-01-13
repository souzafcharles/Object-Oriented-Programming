package souza.charles.sc3005071_p2.model;

public class ApostadorFimDeCarreira<numDivorcios> extends Apostador{

    private Integer numDivorcios;

    public ApostadorFimDeCarreira(String nome, String cpf, String telefone, int idade, boolean interditado) {
        super(nome, cpf, telefone, idade, interditado);
    }

    public ApostadorFimDeCarreira(String nome, String cpf, String telefone, int idade, boolean interditado, Integer numDivorcios) {
        super(nome, cpf, telefone, idade, interditado);
        this.numDivorcios = numDivorcios;
    }

    @Override
    public Integer calculaDivorcios() {
        return numDivorcios;
    }

    public void setNumDivorcios(Integer numDivorcios) {
        this.numDivorcios = numDivorcios;
    }
}
