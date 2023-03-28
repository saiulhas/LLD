package DesignPatterns._03PrototypenRegistry;

import java.util.HashMap;
import java.util.jar.JarEntry;

public class StudentRegistry {

    private HashMap<String, Student> registry;

    public StudentRegistry(){
        this.registry = new HashMap<>();
    }

    public Student get(String batchName){
        return registry.get(batchName);
    }

    public void add(Student obj){
        registry.put(obj.getBatchName(),obj);
    }
}
