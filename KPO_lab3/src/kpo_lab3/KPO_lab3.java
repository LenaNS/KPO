package kpo_lab3;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KPO_lab3 {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = Compound_BD.compound();
            Request.request1(connection, "Monday", 514);
            Request.request2(connection, "Monday");
            Request.request3(connection, 3);
            Request.request4(connection, 2);
            InformationModification.modification(connection, "Vasnetsova", "Sergeeva");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KPO_lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KPO_lab3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                System.out.println("Завершение соединения с БД...");
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(KPO_lab3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
