package kpo_lab3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InformationModification {

    //Метод обновляет запись в столбце "name" таблицы "lecturer"
    public static void modification(Connection connection, String name_lecturer1, String name_lecturer2) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        String sql = "UPDATE lecturer\n"
                + "SET name = \"" + name_lecturer1 + "\"\n"
                + "WHERE name = \"" + name_lecturer2 + "\";";
        statement.executeUpdate(sql);
        System.out.println("\n================\n");
        System.out.println("Модификация информации в БД...");
        System.out.println("БД успешно обновлена");
        System.out.println("\n================\n");
        statement.close();
    }
}
