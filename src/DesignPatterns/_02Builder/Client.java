package DesignPatterns._02Builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setBatchName("Jan 23")
                .setName("Anuj")
                .setGradYear(2023)
                .setYoe(4)
                .setPsp(5.5)
                .build();
    }
}
