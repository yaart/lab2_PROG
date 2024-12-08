package info.Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

//Thunderbolt наносит урон и с вероятностью 10% парализует цель.
public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    private boolean isParalyzed = false;

    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.paralyze(p);
            isParalyzed = true;
        }
    }

    @Override
    protected String describe() {
        return "использует ThunderShock" + ((isParalyzed) ? " и paralyze цель" : "");
    }
}
