package info.Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

// Headbutt наносит урон и с вероятностью 30% заставляет цель вздрогнуть.
public class Headbutt extends PhysicalMove {
    public Headbutt() {
        super(Type.NORMAL, 70, 100);
    }

    private boolean isFlinch = false;

    @Override
    public void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.flinch(p);
            isFlinch = true;
        }
    }

    @Override
    protected String describe() {
        return "использует Headbutt" + ((isFlinch) ? " и flinch цель" : "");
    }

}
