package ru.geekbrains.lesson01;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(new Cross(800), new Wall(50)); // Создаем полосу препятствий
        Team team = new Team("AЛЬФА", new Human("Вася:"), new Cat("Персик:"), new Robot("Терминатор:")); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
