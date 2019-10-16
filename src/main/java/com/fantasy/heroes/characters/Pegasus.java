package com.fantasy.heroes.characters;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.movement.WalkFlyStrategy;

public class Pegasus extends Hero {
    public Pegasus(String name) {
        super(name, new WalkFlyStrategy());
    }
}
