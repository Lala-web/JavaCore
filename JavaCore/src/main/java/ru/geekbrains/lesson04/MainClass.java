package ru.geekbrains.lesson04;

import java.util.HashMap;

public class MainClass {

    public static void main(String[] args) {
        String[] words = {
                "Белый",
                "Черный",
                "Красный",
                "Синий",
                "Оранжевый",
                "Желтый",
                "Зеленый",
                "Фиолетовый",
                "Новый",
                "Б/y",
                "Оранжевый",
                "Новый",
                "Оранжевый",
                "Новый",
                "Зеленый",
                "Акула",
                "Зеленый",
                "Белуга"};
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            Integer res = hm.get(word);
            hm.put(word, res == null ? 1 : res + 1);
        }
        System.out.println(hm);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Петров", "+11234567899");
        phoneBook.add("Петров", "+11234567888");
        phoneBook.add("Петров", "+11234567777");
        phoneBook.add("Сидоров", "+11234566666");

        phoneBook.info();
    }

}
