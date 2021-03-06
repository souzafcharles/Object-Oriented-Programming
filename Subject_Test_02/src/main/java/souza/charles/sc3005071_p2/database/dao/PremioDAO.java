package souza.charles.sc3005071_p2.database.dao;

import souza.charles.sc3005071_p2.database.utils.ConnectionFactory;
import souza.charles.sc3005071_p2.model.Premio;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class PremioDAO implements DAO<Premio,String>{
    @Override
    public boolean save(Premio premio) {
        Objects.requireNonNull(premio, "Valor não pode ser nulo");
        String sql = "INSERT INTO premio  (nome, valorDeclarado, itemFamilia) values (?,?,?)";
        try (PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)) {
            statement.setString(1, premio.getNome());
            statement.setDouble(2, premio.getValorDeclarado());
            if(premio.isItemDeFamilia() == true){
                System.out.println(premio.isItemDeFamilia());
                statement.setInt(3, 1);
            }else{
                statement.setInt(3, 0);
            }
            statement.execute();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public void update(Premio type) {
        throw new UnsupportedOperationException("Funcao Update nao eh suporadada por PremioDAO");
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Funcao Uptade nao eh suporadada por PremioDAO");
    }

    @Override
    public Premio load(String key) {
        throw new UnsupportedOperationException("Funcao Load nao eh suporadada por PremioDAO");
    }

    @Override
    public List<Premio> loadAll() {
        throw new UnsupportedOperationException("Funcao LoadAll nao eh suporadada por PremioDAO");
    }
}
