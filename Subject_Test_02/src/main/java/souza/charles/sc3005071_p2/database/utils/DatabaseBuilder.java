package souza.charles.sc3005071_p2.database.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseBuilder {
    public static void main(String[] args) {
        clear();
        buildApostador();
        buildAposta();
        buildPremio();
    }

    private static void clear() {
        System.out.println("Dados apagados...");
        try {
            Files.deleteIfExists(Paths.get("database.db"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buildApostador() {
        try (Statement statement = ConnectionFactory.createStatement()) {
            statement.addBatch(
                    "CREATE TABLE `apostador` (" +
                            "`nome` TEXT,"+
                            "`cpf` TEXT PRIMARY KEY,"+
                            "`telefone` TEXT,"+
                            "`idade` INTEGER,"+
                            "`interditado` INTEGER"

            );
            statement.executeBatch();
            statement.close();
            System.out.println("Banco de dados criado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buildAposta() {
        try (Statement statement = ConnectionFactory.createStatement()) {
            statement.addBatch(
                    "CREATE TABLE aposta (" +
                            "`momento` TEXT,"+
                            "`juiz` TEXT,"+
                            "`apostador1` TEXT,"+
                            "`apostador2` TEXT,"+
                            "`jogada1` TEXT,"+
                            "`jogada2` TEXT,"+
                            "`ganhador` TEXT,"+
                            "`premio` TEXT,"+
                            " FOREIGN KEY(`apostador1`) REFERENCES `apostador`(`cpf`),"+
                            " FOREIGN KEY(`apostador2`) REFERENCES `apostador`(`cpf`),"+
                            " FOREIGN KEY(`ganhador`) REFERENCES `apostador`(`cpf`),"+
                            " FOREIGN KEY(`premio`) REFERENCES `premio`(`nome`)"

            );
            statement.executeBatch();
            statement.close();
            System.out.println("Banco de dados criado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buildPremio() {
        try (Statement statement = ConnectionFactory.createStatement()) {
            statement.addBatch(
                    "CREATE TABLE `premio` (" +
                            "`nome` TEXT PRIMARY KEY,"+
                            "`valor_declarado` REAL,"+
                            "`item_familia` INTEGER "

            );
            statement.executeBatch();
            statement.close();
            System.out.println("Banco de dados criado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
