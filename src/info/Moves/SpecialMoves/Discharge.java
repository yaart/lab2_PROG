package info.Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

//Discharge наносит урон и с вероятностью 30% парализует цель.
public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80, 100);
    }

    private boolean isParalyzed = false;

    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(p);
            isParalyzed = true;
        }
    }

    @Override
    protected String describe() {
        return "использует Discharge" + ((isParalyzed) ? " и paralyze цель" : "");
    }
}
