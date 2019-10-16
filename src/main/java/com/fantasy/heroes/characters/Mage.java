package com.fantasy.heroes.characters;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.movement.WalkStrategy;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, new WalkStrategy());
    }
}
