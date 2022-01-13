package souza.charles.sc3005071_p2.database.dao;

import souza.charles.sc3005071_p2.database.utils.ConnectionFactory;
import souza.charles.sc3005071_p2.model.Apostador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ApostadorDAO implements DAO<Apostador,Integer>{



    @Override
    public void save(Apostador type) {

    }

    @Override
    public void update(Apostador type) {

    }

    @Override
    public void delete(Integer key) {
        String sql = "Detele Apostador em que o numero do CFP tem o valor =?  ";
        try(PreparedStatement statement = ConnectionFactory.createPreparedStatement(sql)){
            statement.setInt(1,key);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Apostador load(Integer key) {
        return null;
    }

    @Override
    public List<Apostador> loadAll() {
        return null;
    }
}
