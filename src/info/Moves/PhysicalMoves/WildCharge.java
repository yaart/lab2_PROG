package info.Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

//Дикий заряд наносит урон, но пользователь получает 1/4 от того урона, который он наносит при отдаче.
public class WildCharge extends PhysicalMove {
    public WildCharge(){
        super(Type.ELECTRIC, 90,100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect eff = new Effect();
        eff.stat(Stat.HP, (int)p.getHP() - (int)(p.getStat(Stat.ATTACK) / 4));
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "использует WildCharge";
    }
}
