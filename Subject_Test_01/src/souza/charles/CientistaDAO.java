package souza.charles;

import java.util.*;

public class CientistaDAO implements GenericDAO<String, Cientista>{

    private static Map<String, Cientista> cientistas = new LinkedHashMap<>(); //static

    @Override
    public boolean insert(Cientista type) {
        if (type == null) {
            return false;
        }
        if (cientistas.containsKey(type.getCpf())) {
            return false;
        }
        cientistas.put(type.getCpf(), type);
        return true;
    }

    @Override
    public Cientista findOne(String key) {
        if (key == null) {
            return null;
        }
        return cientistas.get(key);
    }

    @Override
    public List<Cientista> findAll() {
        List<Cientista> result = new ArrayList<>(cientistas.values());
        return result;
    }

    @Override
    public boolean update(Cientista type) {
        if (type == null) {
            return false;
        }
        if (!cientistas.containsKey(type.getCpf())) {
            return false;
        }
        Cientista result = cientistas.replace(type.getCpf(), type);
        return result != null;
    }

    @Override
    public boolean remove(String key) {
        if (key == null) {
            return false;
        }
        Cientista result = cientistas.remove(key);
        return result != null;
    }
}
