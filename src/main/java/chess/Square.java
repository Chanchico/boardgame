package chess;

public class Square {

    private Piece piece = null;

    private final int  row ;
    private final char column;

    public Square(Piece piece, int  row, char column) {
        this.piece = piece;
        this.row = row;
        this.column = column;
    }

    public Square(int row, char column){
        this.row = row;
        this.column = column;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isOccupied() {
        return piece != null;
    }

    public int getRow() { return this.row; }

    public char getColumn(){ return this.column;}
}
