import java.util.*;
import java.io.*;

class Student {
    private int id;
    private String name, surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname; // Am adăugat semnul de egal lipsă
    }

    // Copy constructor - se copiază un obiect
    public Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.surname = st.surname; // Corectat pentru a atribui valoarea corectă
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println(String.format("Name: %s\nSurname: %s\nStudent ID: %d\n", name, surname, id));
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(42, "Decebal", "Popescu");
        /*
            Noi dorim să facem o copie a obiectului student1, numită student2,
            apoi să modificăm copia respectivă.
        */
        Student student2 = new Student(student1); // Am creat o copie folosind constructorul de copiere

        student2.setName("Cezar");
        student2.setSurname("Ghiu");

        /*
            Trebuie să afișeze:
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            Trebuie să afișeze:
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();
    }
}
