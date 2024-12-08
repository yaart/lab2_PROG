package info.Moves.SpecialMoves;

import ru.ifmo.se.pokemon.*;

// PowderSnow наносит урон и с вероятностью 10% замораживает цель.
public class PowderSnow extends SpecialMove {
    public PowderSnow() {
        super(Type.ICE, 40, 100);
    }

    private boolean isFrozen = false;

    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.freeze(p);
            isFrozen = true;
        }
    }

    @Override
    protected String describe() {
        return "использует PowderSnow" + ((isFrozen) ? " и freeze цель" : "");
    }

}
