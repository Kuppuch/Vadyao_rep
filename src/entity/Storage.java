package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Storage {
    static int id = 0; // Уникальный идетификатор для всех экземпляров товаров.
    static int idType = 0;
    HashMap<Integer, Product> products = new HashMap<>(); // Список уникальных продуктов, состоящий из идентификатора
    // и продукта.
    List<Type> listType = new ArrayList<>();

    // Метод добавления продукта. Принимает параметры метода в следующей сигнатуре.
    public void addProduct(String name, String type, int count) {
        try { // Пытаемся выполнить следующий код
            Product product = new Product( // Создаём единицу товара
                    id, name, new Type(checkList(type), type)
            );
            checkList(type);
            for ( Type item : listType) {
                if (item.getName().equals(type)) {

                } else {
                    //listType.add(new Type(listType.size() , type.getName()));
                    Product product1 = new Product(
                            id, name, listType.get(0)
                    );
                }
            }
            product.setCount(count); // Заполняем количство товара
            products.put(id, product); // Добавляем в список продуктов
            id++; // Увеличиваем значение идекса на 1 для следующего товара
        } catch (IllegalArgumentException e) { // На случай если параметр пустой, выбрасываем ошибку
            System.out.println(e + " Продукт не может быть пустым");
        }
    }

    public int checkList(String type) {
        var i = listType.indexOf(type);
        if (i == -1) {
            listType.add(new Type(idType, type));
            idType++;
            return listType.size();
        } else {
            return i;
        }
    }

    // Метод для получения товара. Используется для работы с товаром, возращает сам товар из списка
    public Product getProduct(int id) {
        System.out.println("Товар " + products.get(id).getName() + " " + products.get(id).getCount() + " " + products.get(id).getType().getName());
        return products.get(id);
    }

    // Метод покупки товара. Принимает сигнатуру: идентификатор, и количество покупаемого товара.
    public void buyProduct(int id, int count) {
        var product = getProduct(id); // Получаем сам товар
        if (product.getCount() - count < 0) { // Проверяем хватит ли товара для покупки, если не хватит, то выходим из метода вывев ошибку
            System.out.println("Невозможно купить единиц товара(" + count + "). На складе: " + product.getCount());
            return;
        }

        // Обновляем количество товара после покупки
        product.setCount(product.getCount() - count);
        System.out.println("Готово. Товара осталось на складе: " + product.getCount()); // Сообщаем сколько товара осталось
        if (product.getCount() == 0) { // Если товара не осталось, то удаляем его
            products.remove(id);
        }
    }

}
