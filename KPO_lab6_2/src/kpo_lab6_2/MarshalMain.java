package kpo_lab6_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshalMain {

    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Lecturers.class);
            Marshaller m = context.createMarshaller();
            // анонимный класс
            Lecturers lectur = new Lecturers() { 
                {
                    // добавление первого студента​
                    Lecturer lec = new Lecturer("Economy PI", "Abasova", 310, "Friday", 1, 17);
                    this.add(lec);
                    // добавление второго студента​
                    lec = new Lecturer("BD", "Tirskikh", 321, "Tuesday", 2, 21);
                    this.add(lec);
                }
            };
            m.marshal(lectur, new FileOutputStream("src/kpo_lab6_2/KPO_lab6_2_Marshal_XML.xml"));
            // копия на консоль
            m.marshal(lectur, System.out); 
            System.out.println("\nXML-файл создан");
        } catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        } catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
        }
    }
}
