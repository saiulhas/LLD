package SOLID_Principles.OpenClose;

public class Crow extends BirdV2 {

    @Override
    public void fly() {
        System.out.println("Flies at a height of 4 floor);");
    }

    @Override
    public void makeSound() {
        System.out.println("Makes sound caw caw");
    }

    @Override
    public void eat() {
        System.out.println("Eats insects");
    }
}
