package souza.charles;

import java.util.List;

public interface GenericDAO <T, K> {

    boolean insert(T type); //criar uma entrada no DB a partir do objeto <T>
    T findOne(K key); //para obter um objeto <T> do BD a partir de uma chave primária <K>
    List<T> findAll(); //para obter todos os objetos <T> do BD
    List<T> update(T type); //para atualizar um objeto <T> no BD
    boolean remove(K key); // para deletar um objeto no banco a partir de sua chave <K>

}
