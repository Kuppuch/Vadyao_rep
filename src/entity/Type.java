package entity;

public class Type {
    private String name;
    private int id;


//List<String> type = new ArrayList<String>();

    // Конструктор класса Type. Принимает параметры id и название типа.
    public Type(int id, String name) {
        this.name = name;
        this.id = id;
    }

    // Геттеры, сеттеры.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
