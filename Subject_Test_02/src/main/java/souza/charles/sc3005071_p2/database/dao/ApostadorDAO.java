package souza.charles.sc3005071_p2.database.dao;

import souza.charles.sc3005071_p2.database.utils.ConnectionFactory;
import souza.charles.sc3005071_p2.model.Apostador;
import souza.charles.sc3005071_p2.model.ApostadorFimDeCarreira;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApostadorDAO implements DAO<Apostador,String>{

    @Override
    public boolean save(Apostador apostador) {
        Objects.requireNonNull(apostador, "Valor não pode ser nulo");
        final String sql = "INSERT INTO apostador(nome, cpf, telefone, idade, interditado) VALUES(?,?,?,?,?)";
        try (PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)) {
            statement.setString(1, apostador.getNome());;
            statement.setString(2, apostador.getCpf());
            statement.setString(3, apostador.getTelefone());
            statement.setInt(4, apostador.getIdade());
            if (apostador.isInterditado() == true) {
                System.out.println(apostador.isInterditado());
                statement.setInt(5, 1);
            } else {
                statement.setInt(5, 0);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void update(Apostador apostador) {
        Objects.requireNonNull(apostador, "Valor não pode ser nulo");
        final String sql = "UPDATE  apostador SET nome=?,telefone=?, idade=?, interditado=? WHERE cpf=?";
        try(PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)){
            statement.setString(1, apostador.getNome());
            statement.setString(2, apostador.getTelefone());
            statement.setInt(3, apostador.getIdade());
            if (apostador.isInterditado() == true) {
                System.out.println(apostador.isInterditado());
                statement.setInt(4, 1);
            } else {
                statement.setInt(4, 0);
            }
            statement.setString(5, apostador.getCpf());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String key) {
        final String sql = "Delete o Apostador em que o numero do CFP tem o valor =?  ";
        try(PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)){
            statement.setString(2,key);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Apostador load(String key) {
        final String sql = "SELECT * FROM apostador WHERE id=?";
        Apostador apostador = null;
        try(PreparedStatement statement= ConnectionFactory.createPreparedStatement(sql)) {
            statement.setString(2,key);
            ResultSet result = statement.executeQuery();
            if(result.next()){
                String cpf =result.getString("cpf");
                if (cpf=="")
                apostador = new ApostadorFimDeCarreira(result.getString("nome"), result.getString("cpf"), result.getString("telefone"),result.getInt("idade"), result.getBoolean("1"), result.getInt("numDivorcios"));
                apostador.setCpf(result.getString("cpf"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return apostador;
    }

    @Override
    public List<Apostador> loadAll() {
        final String sql = "SELECT * FROM Apostador";
        List<Apostador> apostador = new ArrayList<>();
        try (PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String nome = result.getString("nome");
                String cpf = result.getString("cpf");
                String telefone = result.getString("telefone");
                Integer idade = result.getInt("idade");
                Boolean interdidato = result.getBoolean("interditado");
                if (cpf == ""){
                    apostador.add(new ApostadorFimDeCarreira(nome, cpf, telefone, idade, interdidato));}
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return apostador;
    }
}
