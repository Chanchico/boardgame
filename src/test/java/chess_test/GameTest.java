package chess_test;
import chess.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
