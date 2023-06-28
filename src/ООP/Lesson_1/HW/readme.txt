Добавил 4 класса: Snake, Fish, Bird, Crocodile;

На мой взгляд, такое решение требует постоянное обращение к родителю - Animal.
Думаю, можно сделать немног проще)

---Вопросы---

1. Не могу понять, что означает эта запись:
public Animal(String color, String species, Integer legsCount) {
    this(null, null, null, color, species, null, legsCount);
}

2. И второе, почему в каждом классе, который наследует Animal, нужно писать
подобные конструкции (как в первом вопросе)?
Например, для класса Fish:
public FIsh(String color, String species, Integer legsCount) {
    super(color, species, legsCount);
}