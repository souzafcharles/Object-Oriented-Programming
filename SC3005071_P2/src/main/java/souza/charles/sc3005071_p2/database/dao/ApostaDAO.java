package souza.charles.sc3005071_p2.database.dao;

import souza.charles.sc3005071_p2.database.utils.ConnectionFactory;
import souza.charles.sc3005071_p2.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ApostaDAO implements DAO<Aposta,String> {

    @Override
    public boolean save(Aposta aposta) {
        Objects.requireNonNull(aposta, "Valor não pode ser nulo");
        String sql = "INSERT INTO aposta  (momento, juiz, apostador1, apostador2, jogada1, jogada2, ganhador, premio) VALUES (?,?,?,?,?,?,?,?)";

        try (PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)) {
            statement.setString(1, aposta.getMomento().toString());
            statement.setString(2, aposta.getJuiz());
            statement.setString(3, aposta.getJogador1().getCpf());
            statement.setString(4, aposta.getJogador2().getCpf());
            statement.setString(5, aposta.getJogada1().toString());
            statement.setString(6, aposta.getJogada2().toString());
            statement.setString(7, aposta.getGanhador().getCpf());
            statement.setString(8, aposta.getPremio().getNome());
            PremioDAO premio = new PremioDAO();
            premio.save(aposta.getPremio());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void update(Aposta type) {
        throw new UnsupportedOperationException("Funcao Update nao eh suporadada por ApostaDAO");
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Funcao Deletar nao eh suporadada por ApostaDAO");
    }

    @Override
    public Aposta load(String key) {
        throw new UnsupportedOperationException("Funcao Load nao eh suporadada por ApostaDAO");
    }

    @Override
    public List<Aposta> loadAll() {
        final String sql = "SELECT * FROM Aposta";
        List<Aposta> aposta = new ArrayList<>();
        try (PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                result.getString(1);
                result.getString(2);
                result.getString(3);
                result.getString(4);
                result.getString(5);
                result.getString(6);
                result.getString(7);
                result.getString(8);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aposta;
    }
}



