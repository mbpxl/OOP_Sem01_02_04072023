package ООP.Lesson_1;

public class Snake extends Animal implements Swimable {
    public Snake(String name, Integer age, String vaccination, String color, String species, Owner owner, Integer legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
    }


    @Override
    public boolean swim() {
        return true;
    }
}
