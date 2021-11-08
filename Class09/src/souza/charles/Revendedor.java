package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: October 04, 2021
*/
public class Revendedor extends Funcionario{

    public Revendedor(String cpf, String nome, Integer idade, Boolean sexo, Double valorVendido, Consultor responsavel) {
        super(cpf, nome, idade, sexo, valorVendido, responsavel);

    }

    @Override
    public Double calculaComissao() {
        return getValorVendido()*0.15;
    }
}
