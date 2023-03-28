package DesignPatterns._03PrototypenRegistry.practice;

public class Student implements Prototype<Student> {
    private int id;
    private String name, batchName;

    public Student() {
    }

    public Student(Student s) {
        this.batchName = s.batchName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
}
