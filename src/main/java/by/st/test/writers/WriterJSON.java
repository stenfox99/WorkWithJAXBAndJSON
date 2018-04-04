package by.st.test.writers;

import by.st.test.dto.Student;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WriterJSON extends Writer {

    public WriterJSON(String path){
        this.path = path;
    }

    public WriterJSON(){}

    public void write(Student student) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(path),student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File(path),Student.class);
            System.out.println("JSON");
            System.out.println("name:"+student.getName());
            System.out.println("surname:"+student.getSurname());
            System.out.println("dateBirth:"+student.getDateBirth());
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
