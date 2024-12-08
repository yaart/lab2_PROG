package info.Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//Swagger — способность покемона Bruxish, которая повышает атаку цели на +2 и сбивает её с толку.
public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, +2);
    }
    @Override
    protected String describe(){
        return "использует Swagger и повышает атаку на 2 и confuse цель";
    }
}