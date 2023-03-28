package Bird;

public class Parrot extends FlyingBird{
    @Override
    public void eat() {
        System.out.println("Bird.Parrot eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird.Parrot making sound");
    }

    @Override
    public void fly() {
        System.out.println("Bird.Parrot flying");
    }
}
