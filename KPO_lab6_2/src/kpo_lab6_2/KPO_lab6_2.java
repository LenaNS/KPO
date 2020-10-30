package kpo_lab6_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class KPO_lab6_2 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            JAXBContext jc = JAXBContext.newInstance(Lecturers.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("src/kpo_lab6_2/KPO_lab6_2_XML.xml");
            Lecturers students = (Lecturers) u.unmarshal(reader);
            System.out.println(students);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
    }

}
