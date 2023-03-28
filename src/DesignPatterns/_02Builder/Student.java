package DesignPatterns._02Builder;

import DesignPatterns._02Builder.exception.InvalidGradYearException;
import DesignPatterns._02Builder.exception.InvalidPspException;
import DesignPatterns._02Builder.exception.InvalidYoeException;

public class Student {

    private int id,yoe,gradYear;
    private String name, batchName;
    private double psp;

    private Student(Builder b){
        this.id = b.id;
        this.name = b.name;
        this.yoe = b.yoe;
        this.gradYear = b.gradYear;
        this.psp = b.psp;
        this.batchName= b.batchName;
    }

    public static  Builder builder(){
        Builder b = new Builder();
        return b;
    }

    static class Builder{
        private int id,yoe,gradYear;
        private String name, batchName;
        private double psp;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            if(yoe < 1)
                throw new InvalidYoeException("Invalid Years of experience");
            if(gradYear > 2022)
                throw new InvalidGradYearException("Invalid Grad year exception");
            if(psp < 75){
                throw new InvalidPspException("Invalid PSP exception");
            }
            Student s = new Student(this);
            return s;
        }
    }

}
