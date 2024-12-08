package info.Pokemons;

import info.Moves.PhysicalMoves.Scratch;
import info.Moves.StatusMoves.BulkUp;
import info.Moves.StatusMoves.HoneClaws;
import info.Moves.StatusMoves.Swagger;
import info.Moves.StatusMoves.WillOWisp;
import ru.ifmo.se.pokemon.*;

public final class Bruxish extends Pokemon {
    public Bruxish(String name, int level) {
        super(name, level);
        setStats(68, 105, 70, 70, 70, 92);
        setType(Type.WATER, Type.PSYCHIC);
        setMove(new BulkUp(), new Swagger(), new HoneClaws(), new WillOWisp(), new Scratch());
    }
}