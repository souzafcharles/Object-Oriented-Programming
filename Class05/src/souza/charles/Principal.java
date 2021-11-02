package souza.charles;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: September 13, 2021
*/
public class Principal {
    public static void main(String[] args) {

        UserAccount user1 = new UserAccount("charles@email.com", "Charles");
        UserAccount user2 = new UserAccount("balthazar@email.com", "Balthazar");
        UserAccount user3 = new UserAccount("ophelia@email.com", "Ophélia");
        UserAccount user4 = new UserAccount("ibrains@email.com", "Ibrain");
        UserAccount user5 = new UserAccount("jeferson@email.com", "Jeferson");
        UserAccount user6 = new UserAccount("gabriel@email.com", "Gabriel");

        user1.acceptFollower(user2);
        user1.acceptFollower(user3);
        user6.acceptFollower(user1);
        user1.acceptFollower(user4);
        user1.acceptFollower(user5);
        user2.acceptFollower(user4);
        user1.acceptFollower(user6);

        System.out.println(user1.showMyFriends());
        System.out.println(user6.showMyFriends());
        System.out.println(user2.showMyFriends());

        user3.publish("O que iremos ter almoço?");
        user2.publish("Será que hoje irá fazer sol?");
        user1.publish("Será que dessa vez eu serei aprovado?");
        user5.publish("Jogar Fortnite ou estudar para POO?");
        user4.publish("\"Nessa longa estrada da vida...\"");
        user6.publish("Eu gosto de disciplinas sobre Ciências Econônicas!");
        user1.publish("Será que seu dormir mais unas 5 horas eu vou conseguir terminar as tarefas?");

        String timeline = user1.showTimeline();
        System.out.println("Timeline: " + timeline);

        user1.clapPost(1);
        user2.clapPost(1);
        user3.clapPost(1);
        user1.clapPost(1);
        user4.clapPost(1);
        user5.clapPost(1);

        System.out.println(user1.showMyPosts());
        System.out.println(user2.showMyPosts());
        System.out.println(user3.showMyPosts());
        System.out.println(user4.showMyPosts());
        System.out.println(user5.showMyPosts());
        System.out.println(user6.showMyPosts());
    }
}
