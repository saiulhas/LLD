package DesignPatterns._03PrototypenRegistry.practice;

public class Client {
    public static void main(String[] args) {
        Student aprBatch = new Student();
        aprBatch.setBatchName("apr2021");
        Registry r = new Registry();
        r.add(aprBatch);

        Student s1 = r.retrive("apr2021").clone();
        System.out.println(s1.getBatchName());
    }
}
