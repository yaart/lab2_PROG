package info.Pokemons;

import info.Moves.PhysicalMoves.Scratch;
import info.Moves.PhysicalMoves.WildCharge;
import info.Moves.SpecialMoves.Thunderbolt;
import ru.ifmo.se.pokemon.*;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int level) {
        super(name, level);
        setStats(47,62,45,55,45,46);
        setType(Type.BUG);
        setMove(new WildCharge(), new Thunderbolt(), new Scratch());
    }
}