package souza.charles;
/*
Class title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Asynchronous Content Generic Types by: Charles Fernandes de Souza
Date: October 12, 2021
*/

import java.time.LocalDate;
import java.util.Objects;

public class Client { //CPF (String), name (String), birthDate (LocalDate) e phone (String);
    private String CPF;
    private String name;
    private LocalDate birthDate;
    private String phone;

    public Client(String CPF, String name, LocalDate birthDate, String phone) { //Constructor
        this.CPF = CPF;
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    //setters and getters method
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // equals and hashCode method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return CPF.equals(client.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    // toString method
    @Override
    public String toString() {
        return "Client Data: {" +
                "CPF = '" + CPF + '\'' +
                ", name = '" + name + '\'' +
                ", birthDate = " + birthDate +
                ", phone = '" + phone + '\'' +
                '}';
    }
}


