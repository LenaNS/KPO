package kpo_lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Compound_BD {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/KPO_lab3";
    static final String USER = "root";
    static final String PASSWORD = "";

    //Метод для установки соединение с БД
    public static Connection compound() throws ClassNotFoundException, SQLException {
        System.out.println("Регистрация драйвера JDBC...");
        Class.forName(JDBC_DRIVER);
        System.out.println("Соединение с БД...");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        return connection;
    }
}
