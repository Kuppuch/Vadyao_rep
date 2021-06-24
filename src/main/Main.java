package main;

import entity.Storage;
import entity.Type;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addProduct("Бабаевский",
                "шоколад", 10);
        storage.buyProduct(0, 8);
        storage.buyProduct(0, 2);

        storage.addProduct("Бабаевский",
                "шоколад", 10);
        storage.buyProduct(0, 8);
        storage.buyProduct(0, 2);

        System.out.println();

        storage.addProduct("АлпенГолд",
                 "шоколад", 10);
        storage.buyProduct(1, 8);
        storage.buyProduct(1, 8);

        System.out.println();

        storage.addProduct("Лёвушка",
                "конфеты", 10);
        storage.buyProduct(2, 8);
        storage.buyProduct(2, 8);
    }
}
