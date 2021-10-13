package souza.charles;
/*
Class title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Asynchronous Content Generic Types by: Charles Fernandes de Souza
Date: October 12, 2021
*/
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ClientDAO implements GenericDAO<Client, String>{

    //mapeamentos entre chaves e seus respectivos valores
    Map<String, Client> clientData = new LinkedHashMap<>(); //utilize um LinkedHashMap
                                                       // para simular a persistência de objetos Client
                                                      //em um banco de dados
    @Override
    public boolean insert(Client type) {
        if (!clientData.containsKey(type.getCPF())) { //exemplo video de verificacao antes de inclusao
            clientData.put(type.getCPF(), type);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public Client findOne(String key) {
        return !clientData.containsKey(key) ? null : clientData.get(key); //Metodo no slide 34 MAPAS (INTERFACE MAPS)
    }

    @Override
    public List<Client> findAll() {

        List<Client> findAllClientData = new ArrayList<>();

        for (Map.Entry<String, Client> entry : clientData.entrySet()) { //exemplo slide 35 MAPAS (INTERFACE MAPS)
            //System.out.println(entry);
            findAllClientData.add(entry.getValue());
        }
        return findAllClientData;

    }

    @Override
    public List<Client> update(Client type) {
        List<Client> updateClientData = new ArrayList<>();;
        //clientData.put(type.getCPF(), type.getName(), type.getBirthDate(), type.getPhone());
        return updateClientData;
    }

    @Override
    public boolean remove(String key) {
        if (clientData.containsKey(key)) { //exemplo video de verificacao antes da execusao
            Client removeClientData = clientData.get(key); // Exemplo do metodo no slide 34 MAPAS (INTERFACE MAPS)
            clientData.remove(key, removeClientData); // Exemplo do Metodo no slide 34 MAPAS (INTERFACE MAPS)
            return true;
        } else {
            return false;
        }
    }
}

