package com.fantasy.heroes.movement;

public class FlyStrategy implements MoveStrategy {
    @Override
    public String move() {
        return "fly";
    }
}
