package by.st.test.dto;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "",propOrder = {
        "name",
        "surname",
        "dateBirth"
})
@XmlRootElement(name = "Student")
public class Student {
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Surname")
    private String surname;
    @XmlElement(name = "dateBirth")
    private String dateBirth;

    public Student(String name, String surname, String dateBirth) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
    }

    public Student(){};

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
