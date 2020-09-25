package kpo_lab3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Request {

//Метод выводит  информацию о преподавателях, работающих в заданный день
//недели в заданной аудитории     
    public static void request1(Connection connection, String day_subject, int classroom) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        String sql = "SELECT lecturer.id_lecturer, lecturer.name, subject.name, subject.day_subject, subject.classroom\n"
                + "FROM lecturer INNER JOIN subject ON lecturer.id_subject=subject.id_subject\n"
                + "GROUP BY subject.day_subject, subject.classroom\n"
                + "HAVING subject.day_subject = \"" + day_subject + "\" and subject.classroom = \"" + classroom + "\";";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("Получение данных из БД...");
        System.out.println("\n================\n");
        System.out.println("Запрос №1:");
        while (resultSet.next()) {
            int id_lecturer = resultSet.getInt("lecturer.id_lecturer");
            String nameLecturer = resultSet.getString("lecturer.name");
            String nameSubject = resultSet.getString("subject.name");
            String daySubject = resultSet.getString("subject.day_subject");
            int classroomSubject = resultSet.getInt("subject.classroom");
            System.out.println("id_lecturer: " + id_lecturer);
            System.out.println("Name: " + nameLecturer);
            System.out.println("Name: " + nameSubject);
            System.out.println("daySubject: " + daySubject);
            System.out.println("qclassroomSubject: " + classroomSubject);
        }
        resultSet.close();
        statement.close();
    }

    //Метод выводит  информацию о преподавателях, которые не ведут занятия в за
    //данный день недели
    public static void request2(Connection connection, String day_subject) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        String sql = "SELECT lecturer.id_lecturer, lecturer.name, subject.name, subject.day_subject, subject.classroom\n"
                + "FROM lecturer INNER JOIN subject ON lecturer.id_subject=subject.id_subject\n"
                + "GROUP BY subject.classroom, subject.day_subject\n"
                + "HAVING subject.day_subject NOT IN (\"" + day_subject + "\");";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("\n================\n");
        System.out.println("Запрос №2:");
        while (resultSet.next()) {
            int id_lecturer = resultSet.getInt("lecturer.id_lecturer");
            String nameLecturer = resultSet.getString("lecturer.name");
            String nameSubject = resultSet.getString("subject.name");
            String daySubject = resultSet.getString("subject.day_subject");
            int classroomSubject = resultSet.getInt("subject.classroom");
            System.out.println("id_lecturer: " + id_lecturer);
            System.out.println("Name: " + nameLecturer);
            System.out.println("Name: " + nameSubject);
            System.out.println("daySubject: " + daySubject);
            System.out.println("qclassroomSubject: " + classroomSubject);
        }
        resultSet.close();
        statement.close();
    }

    //Метод, кторый выводит дни недели, в которых проводится заданное количество занятий
    public static void request3(Connection connection, int number_of_lessons) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        String sql = "SELECT day_subject\n"
                + "FROM subject\n"
                + "WHERE Exists (SELECT* From lecturer Where\n"
                + "subject.id_subject = lecturer.id_subject and quantity_of_pairs = " + number_of_lessons + ");";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("\n================\n");
        System.out.println("Запрос №3:");
        while (resultSet.next()) {
            String daySubject = resultSet.getString("subject.day_subject");
            System.out.println("daySubject: " + daySubject);
        }
        resultSet.close();
        statement.close();
    }

    //Метод выводит дни недели, в которых занято заданное количество аудиторий
    public static void request4(Connection connection, int number_of_classroom) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        String sql = "select distinct day_subject from subject group by day_subject having count(distinct classroom)= " + number_of_classroom + ";";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("\n================\n");
        System.out.println("Запрос №4:");
        while (resultSet.next()) {
            String daySubject = resultSet.getString("subject.day_subject");
            System.out.println("daySubject: " + daySubject);
        }
        resultSet.close();
        statement.close();
    }
}
