package com.fantasy;

import com.fantasy.heroes.Hero;
import com.fantasy.heroes.characters.Harpy;
import com.fantasy.heroes.characters.Mage;
import com.fantasy.heroes.characters.Orc;
import com.fantasy.heroes.characters.Pegasus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        Hero harpy = new Harpy("Zina");
        Hero mage = new Mage("Lida");
        Hero orc = new Orc("Dumb");
        Hero pegasus = new Pegasus("Boomer");

        List<Hero> heroes = new ArrayList<>();
        heroes.add(harpy);
        heroes.add(mage);
        heroes.add(orc);
        heroes.add(pegasus);

        heroes.forEach(e -> System.out.println(e.move("Orc cave", "Pegasus mountain")));
    }
}
