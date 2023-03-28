package DesignPatterns._03PrototypenRegistry;

public class Client {
    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();

        Student aprBatch = new Student();
        aprBatch.setBatchName("apr lld batch");
        aprBatch.setYearOfEnrollment(2023);
        aprBatch.setPsp(60);

        registry.add(aprBatch);

        Student s1 = aprBatch.clone();
        Student s2 = aprBatch.clone();

        Student mayBatch = new Student();
        mayBatch.setBatchName("may lld batch");
        mayBatch.setYearOfEnrollment(2023);
        mayBatch.setPsp(65);
        registry.add(mayBatch);


        Student junBatch = new Student();
        junBatch.setBatchName("jun lld batch");
        junBatch.setYearOfEnrollment(2023);
        junBatch.setPsp(70);
        registry.add(junBatch);

        Student mayStudent = registry.get("may lld batch").clone();
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName("Intelligent group");
        intelligentStudent.setPsp(80);
        intelligentStudent.setYearOfEnrollment(2020);
        intelligentStudent.setIq(100);

        IntelligentStudent iqStudent1 = intelligentStudent.clone();
    }
}
