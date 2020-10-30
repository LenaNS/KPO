package kpo_lab6_2;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "timetable_of_classes")
public class Lecturers {

    @XmlElement(name = "lecturer")
    private ArrayList<Lecturer> list = new ArrayList<Lecturer>();

    public Lecturers() {
        super();
    }

    public void setList(ArrayList<Lecturer> list) {
        this.list = list;
    }

    public boolean add(Lecturer st) {
        return list.add(st);
    }

    @Override
    public String toString() {
        return "Lecturers [list=" + list + "]";

    }
}
