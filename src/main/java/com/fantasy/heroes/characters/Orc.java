package com.fantasy.heroes.characters;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.movement.WalkStrategy;

public class Orge extends Hero {
    public Orge(String name) {
        super(name, new WalkStrategy());
    }
}
