package com.fantasy.heroes.characters;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.movement.WalkStrategy;

public class Orc extends Hero {
    public Orc(String name) {
        super(name, new WalkStrategy());
    }
}
