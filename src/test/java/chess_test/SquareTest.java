package chess_test;

import chess.Color;
import chess.Square;
import chess.Rook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SquareTest {
    @Test
    void testShouldReturnFalseIfSquareIsOccupied(){
        Square square = new Square(null, 1, 'a');
        assertFalse(square.isOccupied());
    }

    @Test
    void testShouldReturnTrueIfSquareIsOccupied(){
        Square square = new Square(new Rook(Color.WHITE), 1, 'a');
        assertTrue(square.isOccupied());
    }
}
