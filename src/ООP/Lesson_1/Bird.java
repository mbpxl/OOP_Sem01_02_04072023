package ООP.Lesson_1;

public class Bird extends Animal implements Flyable, Soundable {

    public Bird(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean makeSound() {
        return true;
    }
}
