package info.Pokemons;

import info.Moves.SpecialMoves.Discharge;
import ru.ifmo.se.pokemon.*;

public class Charjabug extends Grubbin {
    public Charjabug(String name, int level){
        super(name,level);
        setStats(57, 82, 95, 55, 75, 36);
        setType(Type.BUG, Type.ELECTRIC);
        setMove(new Discharge());
    }
}