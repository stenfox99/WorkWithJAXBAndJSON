package by.st.test.writers;

import by.st.test.dto.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class WriterJAXB extends Writer {

    public WriterJAXB(String path){
        this.path = path;
    }

    public WriterJAXB(){}

    public void write(Student student) {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

            jaxbMarshaller.marshal(student,file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void read() {
        File file = new File(path);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Student student = (Student) jaxbUnmarshaller.unmarshal(file);
            System.out.println("XML");
            System.out.println("name:"+student.getName());
            System.out.println("surname:"+student.getSurname());
            System.out.println("dateBirth:"+student.getDateBirth());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
