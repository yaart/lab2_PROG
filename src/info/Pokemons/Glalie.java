package info.Pokemons;

import info.Moves.PhysicalMoves.Bulldoze;
import ru.ifmo.se.pokemon.*;

public final class Glalie extends Snorunt {
    public Glalie(String name, int level) {
        super(name, level);

        setStats(80, 80, 80, 80, 80, 80);
        setType(Type.ICE);
        setMove(new Bulldoze());
    }
}
