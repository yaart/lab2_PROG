package info.Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//Hone Claws повышают атаку и точность на 1.

public class HoneClaws extends StatusMove {
    public HoneClaws(){
        super(Type.DARK, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.ACCURACY, +1);
    }

    @Override
    protected String describe(){
        return "использует HoneClaws и повышают атаку и точность на 1";
    }
}
