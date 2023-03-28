package SOLID_Principles.OpenClose;

public class Penguin extends BirdV2{
    @Override
    public void fly() {
        //usually penguins dont fly but forced to implement fly method
        System.out.println("Cant fly");
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }
}
