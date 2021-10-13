package souza.charles;
/*
Class title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Asynchronous Content Generic Types by: Charles Fernandes de Souza
Date: October 12, 2021
*/

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ClientDAO clientSystemData = new ClientDAO();

        //Insert
        Client clientData01 = new Client("390.153.068-18", "Charles Souza", LocalDate.now(), "(16) 98239-8989");
        clientSystemData.insert(clientData01);
        Client clientData02 = new Client("411.264.179-21", "Balthazar de Bigode", LocalDate.now(), "(16) 98239-9898");
        clientSystemData.insert(clientData02);
        Client clientData03 = new Client("422.265.171-22", "Ophelia Tricolore", LocalDate.now(), "(16) 98239-1515");
        clientSystemData.insert(clientData03);

        //FindOne
        System.out.println(clientSystemData.findOne("411.264.179-21"));

        //FindAll
        System.out.println(clientSystemData.findAll());


        //Update
        //clientSystemData.update("390.153.068-18", "Charles Fernandes de Souza");

        //Remove
        clientSystemData.remove("411.264.179-21");

        System.out.println(clientSystemData.findAll());

    }

}
