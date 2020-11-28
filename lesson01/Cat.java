package ru.geekbrains.lesson01;

public class Cat implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;

    private boolean active;

    public Cat(String name) {

        this.name = name;
        this.maxRunDistance = 200;
        this.maxJumpHeigth = 10;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " пробежал кросс!");
        } else {
            active = false;
            return (name + " не пробежал кросс!");

        }
    }


    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return (name + " перепрыгнул стену!");
        } else {
            active = false;
            return (name + " не перепрыгнул стену!");
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}
