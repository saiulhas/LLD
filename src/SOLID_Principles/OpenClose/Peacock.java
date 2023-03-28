package SOLID_Principles.OpenClose;

public class Peacock extends BirdV2 {
    @Override
    public void fly() {
        System.out.println("Can fly for few seconds at a very less height");
    }

    @Override
    public void makeSound() {
        System.out.println("It sings");
    }

    @Override
    public void eat() {
        System.out.println("Eats plants");
    }
}
