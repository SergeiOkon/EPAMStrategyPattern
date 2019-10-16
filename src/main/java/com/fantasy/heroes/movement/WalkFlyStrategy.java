package com.fantasy.heroes.movement;

public class WalkFlyStrategy implements MoveStrategy {
    @Override
    public String move() {
        return "walk and fly";
    }
}
