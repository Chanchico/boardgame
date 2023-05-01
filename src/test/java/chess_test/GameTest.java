package chess_test;
import chess.Color;
import chess.Game;
import chess.Square;
import chess.Pawn;
import chess.Rook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    public void shouldHaveSixtyFourSquare()   {
        Game game = new Game();
        int i;
        for(i = 0; i < game.getBoard().size(); i++ ){
            assertEquals(8, game.getBoard().get(i).size() );
        }
        assertEquals(64, game.getBoard().size() * i );
    }

    @Test
    public void shouldReturnTheRequestedSquare(){
        Game game = new Game();
        for (int i = 0; i < 8; i++){
            int row = 1 + i;
            for(int j = 0; j < 8; j++) {
                char column = (char) ('A' + j);
                Square square = game.getSquare(row, column);
                assertEquals(row, square.getRow());
                assertEquals(column, square.getColumn());
                //System.out.println(square.getRow() + ", " + square.getColumn());
            }
        }
    }

    @Test
    public void shouldReplacePiece(){
        Game game = new Game();
        Square square = new Square(new Pawn(Color.BLACK), 3, 'A');
        Rook rook = new Rook(Color.WHITE);
        assertTrue(game.changeSquare(square, rook));
        assertEquals(1, game.getWhitePlayer());
    }

    @Test
    public void shouldOnlyMove(){
        Game game = new Game();

    }

}
