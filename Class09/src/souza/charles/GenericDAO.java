package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: October 04, 2021
*/
import java.util.List;

public interface GenericDAO<K, T> {
    boolean insert(T type);
    T findOne (K key);
    List<T> findAll();
    boolean update(T type);
    boolean remove(K key);
}
