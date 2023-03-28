package Bird;

public class Penguin extends NonFlyingBird{
    @Override
    public void eat() {
        System.out.println("Bird.Penguin eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird.Penguin making sound");
    }
}
