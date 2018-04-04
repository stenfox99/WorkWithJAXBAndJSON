package by.st.test;

import by.st.test.dto.Student;
import by.st.test.writers.WriterJSON;
import by.st.test.writers.Writer;
import by.st.test.writers.WriterJAXB;

public class start {
    public static void main(String[] args) {
        write(new WriterJAXB("JAXB.xml"));
        write(new WriterJSON("JSON.json"));
        System.out.println("The recording is finish");
        System.out.println("Reading start");
        read(new WriterJAXB("JAXB.xml"));
        System.out.println();
        read(new WriterJSON("JSON.json"));
    }

    private static void write(Writer writer){
        Student student = new Student("name", "surname", "02.04.2018");
        writer.write(student);
    }

    private static void read(Writer writer){
        writer.read();
    }
}
