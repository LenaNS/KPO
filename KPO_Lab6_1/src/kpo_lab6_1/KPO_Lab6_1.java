package kpo_lab6_1;

import java.io.IOException;
import java.io.InvalidObjectException;

public class KPO_Lab6_1 {

    public static void main(String[] args) throws IOException {
        // создание и запись объекта​
        Lecturer ob = new Lecturer("Economy", "Kirillova", 321, "Friday", 3, 15);
        System.out.println(ob);
        String file = "src\\kpo_lab6_1\\ttt.txt";
        Serializator sz = new Serializator();
        boolean b = sz.serialization(ob, file);
        // изменение значения static-поля​
        ob.setSubject("Economy PI");
        ob.setClassroom(205);
        // чтение и вывод объекта​
        Lecturer res = null;
        try {
            res = sz.deserialization(file);
        } catch (InvalidObjectException e) {
            // обработка​
            e.printStackTrace();
        }
        System.out.println(res);

    }

}
