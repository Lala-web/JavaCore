package ru.geekbrains.lesson01;

public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    String doit(Competitor competitor) {
        return competitor.run(length);
    }
}
