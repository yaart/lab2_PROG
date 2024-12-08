package info.Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

// Bulldoze наносит урон и снижает скорость цели на -1.

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Bulldoze и снижает скорость цели на 1";
    }
}
