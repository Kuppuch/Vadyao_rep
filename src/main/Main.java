package main;

import entity.Product;
import entity.Storage;
import entity.Type;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addProduct("Бабаевский", new Type(0, "шоколад"), 14, 100);
        storage.addProduct("АлпенГолд", new Type(0, "шоколад"), 16, 80);
        storage.addProduct("Лёвушка", new Type(1, "конфеты"), 50, 12);
        storage.addProduct("Нива", new Type(1, "конфеты"), 60, 17);
        storage.addProduct("Маска", new Type(1, "конфеты"), 55, 17);
        storage.addProduct("Милка", new Type(1, "шоколад"), 25, 95);
        storage.addProduct("Победа", new Type(1, "шоколад"), 40, 100);
        storage.addProduct("Красная цена", new Type(1, "шоколад"), 365, 75);
        storage.addProduct("Алёнка", new Type(1, "шоколад"), 17, 100);
        storage.addProduct("Что-то", new Type(1, "конфеты"), 34, 95);

        System.out.println();

        storage.getTypeWeight("Что-то");

        System.out.println();

        storage.buyProduct( "Бабаевский", 8);
        storage.buyProduct( "Бабаевский", 7);
        storage.buyProduct( "АлпенГолд", 8);
        storage.buyProduct( "АлпенГолд", 4);
        storage.buyProduct( "Лёвушка", 8);
        storage.buyProduct( "Лёвушка", 8);
        storage.buyProduct( "Нива", 3);
        storage.buyProduct( "Нива", 1);
        storage.buyProduct( "Маска", 5);
        storage.buyProduct("Маска", 6);
        storage.buyProduct( "Милка", 7);
        storage.buyProduct( "Милка", 1);
        storage.buyProduct( "Победа", 6);
        storage.buyProduct( "Победа", 6);
        storage.buyProduct( "Красная цена", 300);
        storage.buyProduct( "Красная цена", 65);
        storage.buyProduct("Алёнка", 2);
        storage.buyProduct( "Алёнка", 1);

        storage.buyProductByWeight("Нива", 18);

        storage.getTypeWeight("Что-то");
    }
}
