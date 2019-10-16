package com.fantasy.heroes.characters;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.movement.FlyStrategy;

public class Harpy extends Hero {
    public Harpy(String name) {
        super(name, new FlyStrategy());
    }
}
