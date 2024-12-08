package info.Pokemons;

import info.Moves.PhysicalMoves.Bite;
import ru.ifmo.se.pokemon.*;

public class Vikavolt extends Charjabug {
    public Vikavolt(String name, int level) {
        super(name, level);
        setStats(77, 10, 90,145,75,43);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Bite());
    }
}