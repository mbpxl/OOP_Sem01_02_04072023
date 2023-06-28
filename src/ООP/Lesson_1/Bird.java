package ООP.Lesson_1;

public class Bird extends Animal {

    public Bird(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    protected void fly() {
        super.fly();
    }
}
