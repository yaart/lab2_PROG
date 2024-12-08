package info.Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

//Bite наносит урон и с вероятностью 30% заставляет цель вздрогнуть.

public class Bite extends PhysicalMove {
    public Bite() {
        super(Type.DARK, 60, 100);
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
        return "использует Bite" + ((isFlinch) ? " и flinch цель" : "");
    }

}
