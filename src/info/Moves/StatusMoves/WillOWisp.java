package info.Moves.StatusMoves;

import ru.ifmo.se.pokemon.*;

//Блуждающий огонек сжигает цель, если попадает в нее. Обожженный покемон теряет 1/8 здоровья, а его атака снижается на 50%.
public class WillOWisp extends StatusMove {
    public WillOWisp(){
        super(Type.FIRE, 0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect eff = new Effect();
        eff.burn(p);
        eff.stat(Stat.HP, (int)p.getHP() - (int)(p.getStat(Stat.HP) / 8));
        eff.stat(Stat.ATTACK, (int)p.getStat(Stat.ATTACK) / 2);
        p.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "использует WillOWisp и снижает атаку на 50%";
    }
}
