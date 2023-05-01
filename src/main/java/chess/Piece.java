package chess;

import chess.Color;

public abstract class  Piece {
    private final Color color;
    private final int value;
    public Piece(Color color, int value){
        this.color = color;
        this.value = value;
    }

    public Color getColor(){
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    public void move(){};
}


