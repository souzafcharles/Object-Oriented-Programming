package souza.charles.sc3005071_p2.database.dao;

import java.util.List;

public interface  DAO<T,K> {
    boolean save(T type);
    void update(T type);
    void delete(K key);
    T load(K key);
    List<T> loadAll();
}
