package info.Pokemons;

import info.Moves.PhysicalMoves.Bite;
import info.Moves.PhysicalMoves.Headbutt;
import info.Moves.PhysicalMoves.Scratch;
import info.Moves.SpecialMoves.PowderSnow;
import ru.ifmo.se.pokemon.*;

public class Snorunt extends Pokemon {
    public Snorunt(String name, int level) {
        super(name, level);
        setStats(50,50,50,50,50,50);
        setType(Type.ICE);
        setMove(new PowderSnow(), new Bite(), new Headbutt(),new Scratch());
    }
}