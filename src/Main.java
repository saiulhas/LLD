import Bird.Bird;
import Bird.FlyingBird;
import Bird.Parrot;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Parrot p = new Parrot();
        p.eat();
        p.makeSound();
        p.fly();

        FlyingBird b2 = new Parrot();
        b2.makeSound();
        b2.eat();
        b2.fly();

        Bird b = new Parrot();
        b.eat();
        b.makeSound();
     //   b.fly() --> cant access
         
    }
}
