package lt.techin.oop;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("green", 1, true);
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
