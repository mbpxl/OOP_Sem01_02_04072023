package ООP.Lesson_1;

public class Crocodile extends Animal implements Swimable, Runnable, Soundable {

    public Crocodile(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }


    @Override
    public boolean run() {
        return true;
    }

    @Override
    public boolean makeSound() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
