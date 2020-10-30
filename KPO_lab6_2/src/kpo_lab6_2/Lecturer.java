package kpo_lab6_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "subject",
    "name",
    "classroom",
    "day_of_week",
    "number_of_students",
    "number_of_pairs"
}) // задание последовательности элементов XML

public class Lecturer {

    @XmlElement(required = true)
    private int number_of_pairs;
    @XmlElement(required = true)
    private static String subject;
    @XmlElement(required = true)
    private String name;
    @XmlElement(required = true)
    private int classroom;
    @XmlElement(required = true)
    private String day_of_week;
    @XmlElement(required = true)
    private int number_of_students;

    // необходим для маршаллизации/демаршалиизации XML
    public Lecturer() {
    }

    public Lecturer(String subject, String name, int classroom, String day_of_week, int number_of_students, int number_of_pairs) {
        this.subject = subject;
        this.name = name;
        this.classroom = classroom;
        this.day_of_week = day_of_week;
        this.number_of_students = number_of_students;
        this.number_of_pairs = number_of_pairs;
    }

    public int getNumber_of_pairs() {
        return number_of_pairs;
    }

    public void setNumber_of_pairs(int number_of_pairs) {
        this.number_of_pairs = number_of_pairs;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public int getNumber_of_students() {
        return number_of_students;
    }

    public void setNumber_of_students(int number_of_students) {
        this.number_of_students = number_of_students;
    }

    @Override
    public String toString() {
        return "ClassPojo [name = " + name + ", subject = " + subject + ", day_of_week = " + day_of_week + ", classroom = " + classroom + ", number_of_pairs = " + number_of_pairs + ", number_of_students = " + number_of_students + "]";
    }
}
