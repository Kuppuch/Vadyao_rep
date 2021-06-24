package entity;

public class Type {
    protected int id;
    protected String name;

    // Конструктор класса Type. Принимает параметры id и название типа.
    public Type(int id, String name) {
        this.id = id;
        this.name = name;
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


}
