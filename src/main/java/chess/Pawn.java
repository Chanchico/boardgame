package chess.pieces;

import chess.Color;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, PieceValue.PAWN.getValue());
    }

    void isInitialPosition() {
    }

}