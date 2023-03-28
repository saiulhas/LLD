package DesignPatterns._02Builder.practice;

public class Student {
    private int id,yoe,gradYear;
    private String name,batch;

    private Student(Builder b){
        this.id = b.id;
        this.name = b.name;
        this.yoe = b.yoe;
        this.gradYear = b.gradYear;
        this.batch = b.batch;
    }

    public int getId() {
        return id;
    }

    public int getYoe() {
        return yoe;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder{
        private int id,yoe,gradYear;
        private String name,batch;

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

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build() throws Exception{

            //validations
            if(yoe<1) throw new Exception();

            Student s = new Student(this);
            return s;
        }
    }


}
