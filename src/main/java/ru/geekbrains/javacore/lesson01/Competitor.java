package ru.geekbrains.javacore.lesson01;

public interface Competitor {
    String run(int dist);

    String jump(int height);

    boolean isOnDistance();

    void info();
}