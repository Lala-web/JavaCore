package ru.geekbrains.lesson01;

public interface Competitor {
    String run(int dist);

    String jump(int height);

    boolean isOnDistance();

    void info();
}
