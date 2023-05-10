package chess;

import chess.Color;

public abstract class  Piece {

    private final PieceType type;
    private final Color color;
    private final int value;

    private int positionY = 0;
    private char positionX = 'X';
    public Piece(Color color, PieceType type){
        this.color = color;
        this.type = type;
        this.value = type.getValue();
    }

    public PieceType getType() {
        return type;
    }

    public Color getColor(){
        return this.color;
    }

    public int getValue() {
        return this.value;
    }

    public void setPosition(int y, char x){
        this.positionX = x;
        this.positionY = y;
    };
}


