package ООP.Lesson_1;

public class Dog extends Animal implements Runnable, Soundable, Swimable {

    public Dog(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
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
