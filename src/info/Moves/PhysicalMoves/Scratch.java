package info.Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

// Базовое движение наносит урон без каких-либо дополнительных эффектов.
public class Scratch extends PhysicalMove {
    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }

    @Override
    protected String describe() {
        return "использует Scratch";
    }
}