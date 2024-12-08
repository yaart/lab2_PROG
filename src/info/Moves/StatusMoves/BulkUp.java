package info.Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//BulkUp увеличивает атаку и защиту пользователя на +1.
public class BulkUp extends StatusMove {
    public BulkUp(){
        super(Type.FIGHTING, 0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.DEFENSE, +1);
    }

    @Override
    protected String describe(){
        return "использует BulkUp и увеличивает атаку и защиту на 1";
    }

}
