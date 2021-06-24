package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage {
    static int id = 0; // Уникальный идетификатор для всех экземпляров товаров.
    List<Product> products = new ArrayList<>(); // Список уникальных продуктов, состоящий из идентификатора
    // и продукта.

    // Метод добавления продукта. Принимает параметры метода в следующей сигнатуре.
    public void addProduct(String name, Type type, int count, double weight) {
        try { // Пытаемся выполнить следующий код
            Product product = new Product( // Создаём единицу товара
                    id, name, type, weight
            );
            product.setCount(count); // Заполняем количство товара
            products.add(product); // Добавляем в список продуктов
            id++; // Увеличиваем значение идекса на 1 для следующего товара
            System.out.println("Товар " + product.getName() + " добавлен в количестве " + product.getCount() + " штук. " + product.getCount() * product.getWeight() / 1000 + "кг");
        } catch (IllegalArgumentException e) { // На случай если параметр пустой, выбрасываем ошибку
            System.out.println(e + " Продукт не может быть пустым");
        }
    }

    // Метод для получения товара. Используется для работы с товаром, возращает сам товар из списка
    public Product getProduct(int id) {
        System.out.println("Товар \"" + products.get(id).getName() + "\". На складе: " + products.get(id).getCount());
        return products.get(id);
    }

    public void getTypeWeight(String name) {
        List<Product> localProducts = new ArrayList<>();
        double allWeight = 0;
        for (Product product : products) {
            if (product.getName().equals(name)) {
                allWeight +=  product.getCount() * product.getWeight();
            }
        }
        if (allWeight == 0) {
            System.out.println("Такого товара нет на складе");
        } else {
            System.out.println("Вес всех товаров \"" + name + "\" равен: " + allWeight);
        }
    }

    // Метод покупки товара. Принимает сигнатуру: идентификатор, и количество покупаемого товара.
    public void buyProduct(String name, int count) {
        System.out.println("Покупка товара " + name + " в количестве " + count);
        for (Product product : products) {
            if (product.getName().equals(name)) {
                if (product.getCount() - count < 0) {  // Проверяем хватит ли товара для покупки, если не хватит, то выходим из метода вывев ошибку
                    System.out.println("Невозможно купить единиц товара(" + count + "). На складе: " + product.getCount() + "шт. "+ product.getCount()*product.getWeight() / 1000 + "кг");
                    System.out.println();
                    return;
                }

                product.setCount(product.getCount() - count);
                System.out.println("Совершена покупка. Товара осталось на складе: " + product.getCount() + "шт. " + product.getCount() * product.getWeight() / 1000 + "кг.");  // Сообщаем сколько товара осталось
                System.out.println();
//                if (product.getCount() == 0) { // Если товара не осталось, то удаляем его
//                    products.remove(product);
//                }
            }
        }

//        var product = getProduct(id); // Получаем сам товар
//        if (product.getCount() - count < 0) {  // Проверяем хватит ли товара для покупки, если не хватит, то выходим из метода вывев ошибку
//            System.out.println("Невозможно купить единиц товара(" + count + "). На складе: " + product.getCount() + "шт. "+ product.getCount()*product.getWeight() / 1000 + "кг");
//            System.out.println();
//            return;
//        }
//
//        product.setCount(product.getCount() - count);
//        System.out.println("Совершена покупка. Товара осталось на складе: " + product.getCount());  // Сообщаем сколько товара осталось
//        System.out.println();
//        if (product.getCount() == 0) { // Если товара не осталось, то удаляем его
//            products.remove(product);
//        }
    }

    public void buyProductByWeight(String name, double weight) {
        System.out.println("Покупка товара " + name + " в количестве " + weight);
        for (Product product : products) {
            if (product.getName().equals(name)) {
                if (product.getWeight() * product.getCount() < weight) {
                    System.out.print("Столько ");
                    System.out.print(product.getType().getName() == "шоколад" ? "шоколада" : "конфет");
                    System.out.println(" нет на складе.");
                } else {
                    Math.ceil(weight / product.getWeight());
                    System.out.print("Для покупки такого количества грамм товара необходимо приобрести ");
                    System.out.print((int)Math.ceil(weight / product.getWeight()));
                    System.out.print(" полных товара.");
                }

            }
        }
    }

}
