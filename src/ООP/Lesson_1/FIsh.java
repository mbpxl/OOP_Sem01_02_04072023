package ООP.Lesson_1;

public class FIsh extends Animal implements Swimable {

    public FIsh(String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }


    @Override
    public boolean swim() {
        return true;
    }
}
