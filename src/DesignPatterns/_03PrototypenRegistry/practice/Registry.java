package DesignPatterns._03PrototypenRegistry.practice;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    Map<String, Student> registry;

    public Registry() {
        registry = new HashMap<>();
    }

    public void add(Student s){
        registry.put(s.getBatchName(),s);
    }

    public Student retrive(String batchName){
        return registry.get(batchName);
    }
}
