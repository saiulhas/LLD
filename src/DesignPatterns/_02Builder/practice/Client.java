package DesignPatterns._02Builder.practice;

public class Client {
    public static void main(String[] args) throws Exception {
        Student s = Student.builder()
                .setBatch("Jan2023")
                .setId(1)
                .setYoe(0)
                .setName("Sunny")
                .setGradYear(2022)
                .build();
        System.out.println(s.getName());
    }

}
