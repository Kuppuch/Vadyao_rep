package entity;

// Класс - номенклатура. Уникальная единица товара.
public class Candy {
    private int id;
    private String name;
    private Type type;
    private double weight;

    // Конструктор класса требудет чтобы при создании были заполнены все поля.
    public Candy(int id, String name, Type type, double weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

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
