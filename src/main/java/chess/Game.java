package chess;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final List<List<Square>> board;
    private int blackPlayer = 0;
    private int whitePlayer = 0;



    public Game(){
        this.board = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            List<Square> row = new ArrayList<>();
            for(int j = 0; j < 8; j++){
                row.add(new Square(i + 1, (char) (0x0041 + j)));
            }
            this.board.add(row);
        }
    }

    public int getBlackPlayer() {
        return this.blackPlayer;
    }

    public int getWhitePlayer() {
        return this.whitePlayer;
    }

    public List<List<Square>> getBoard(){
        return this.board;
    }

    public boolean changeSquare(Square square, Piece piece){
        if (square.isOccupied()){
            Piece pieceToKill = square.getPiece();
            if (piece.getColor() == pieceToKill.getColor()){
                return false;
            }
            else {
                switch (piece.getColor()) {
                    case WHITE -> this.whitePlayer += pieceToKill.getValue();
                    case BLACK -> this.blackPlayer += pieceToKill.getValue();
                }
                return true;
            }
        }
        square.setPiece(piece);
        return true;

    }

    public Square getSquare(int row, char column){
        int columnPosition = (int) column - 'A';

        return board.get(row - 1).get(columnPosition);
    }
}
