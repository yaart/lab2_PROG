package info;

import info.Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon Bruxish = new Bruxish("Bruxish", 1);
        Pokemon Snorunt = new Snorunt("Snorunt", 1);
        Pokemon Glalie = new Glalie("Glalie", 1);
        Pokemon Grubbin = new Grubbin("Grubbin", 1);
        Pokemon Charjabug = new Charjabug("Charjabug", 1);
        Pokemon Vikavolt = new Vikavolt("Vikavolt", 1);


        battle.addAlly(Bruxish);
        battle.addAlly(Glalie);
        battle.addAlly(Grubbin);

        battle.addFoe(Snorunt);
        battle.addFoe(Charjabug);
        battle.addFoe(Vikavolt);

        battle.go();
    }
}