package entity;

// Класс - номенклатура. Уникальная единица товара.
public class Candy {
    private int id;
    private String name;
    private Type type; // Сделано отдельной сущностью по второй нормальной форме БД.
    // Если кратко, то сущность, которая часто повторяется, должна быть вынесены в отдельную талицу и
    // подставляться индексы

    // Конструктор класса требудет чтобы при создании были заполнены все поля.
    public Candy(int id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    // Геттеры, сеттеры.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
