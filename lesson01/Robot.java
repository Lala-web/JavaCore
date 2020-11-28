package ru.geekbrains.lesson01;

public class Robot implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeigth;
    private int maxSwimDistance;

    private boolean active;

    public Robot(String name) {

        this.name = name;
        this.maxRunDistance = 10000;
        this.maxJumpHeigth = 600;
        this.active = true;
    }

    @Override
    public String run(int dist) {
        if (dist <= maxRunDistance) {
            return (name + " пробежал кросс!");
        } else {
            active = false;
            return (name + " не справился с кроссом!");

        }
    }


    @Override
    public String jump(int height) {
        if (height <= maxJumpHeigth) {
            return (name + " перепрыгнул стену!");
        } else {
            active = false;
            return (name + " не смог перепрыгнуть стену!");
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
