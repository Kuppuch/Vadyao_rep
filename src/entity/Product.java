package entity;

public class Product extends Candy {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product(int id, String name, Type type, double weight) {
        super(id, name, type, weight);
    }
}
