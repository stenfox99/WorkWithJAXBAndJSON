package by.st.test.writers;

import by.st.test.dto.Student;

public abstract class Writer {
    protected String path;

    protected Writer(String path) {
        this.path = path;
    }

    protected Writer(){}

    public abstract void write(Student student);

    public abstract void read();

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
