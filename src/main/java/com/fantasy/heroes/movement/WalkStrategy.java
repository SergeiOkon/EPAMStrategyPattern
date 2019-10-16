package com.fantasy.heroes.movement;

public class WalkStrategy implements MoveStrategy {
    @Override
    public String move() {
        return "walk";
    }
}
