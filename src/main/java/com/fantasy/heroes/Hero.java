package com.fantasy.heroes;

import com.fantasy.heroes.movement.MoveStrategy;

public class Hero {
    private MoveStrategy movingStrategy;
    private String name;

    public Hero(String name, MoveStrategy movingStrategy) {
        this.name = name;
        this.movingStrategy = movingStrategy;
    }

    public void setMovingStrategy(MoveStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public String move(String from, String to) {
        return name + " " +
                movingStrategy.move() +
                " from " + from +
                " to " + to + ".";
    }


}
