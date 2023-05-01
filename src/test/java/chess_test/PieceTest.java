package chess_test;

import chess.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PieceTest {
    @Test
    public void testShouldReturnCorrectColorOfChessPiece(){
        Piece whitePiece = new King(Color.WHITE);
        assertEquals(Color.WHITE, whitePiece.getColor());

        Piece blackPiece = new King(Color.BLACK);
        assertEquals(Color.BLACK, blackPiece.getColor());


    }
    @Test
    public void testShouldReturnCorrectValuePointOfChessPiece(){
        Piece piece = new King(Color.WHITE);
        assertEquals( PieceValue.PAWN.getValue(), piece.getValue());

        // Black pieces
        King blackKing = new King(Color.BLACK);
        assertEquals(PieceValue.KING.getValue(), blackKing.getValue());

        Queen blackQueen = new Queen(Color.BLACK);
        assertEquals(PieceValue.QUEEN.getValue(), blackQueen.getValue());

        Rook blackRook = new Rook(Color.BLACK);
        assertEquals(PieceValue.ROOK.getValue(), blackRook.getValue());

        Bishop blackBishop = new Bishop(Color.BLACK);
        assertEquals(PieceValue.BISHOP.getValue(), blackBishop.getValue());

        Knight knightBlack = new Knight(Color.BLACK);
        assertEquals(PieceValue.KNIGHT.getValue(), knightBlack.getValue());

        Pawn pawnblack = new Pawn(Color.BLACK);
        assertEquals(PieceValue.PAWN.getValue(), pawnblack.getValue());

        // White pieces
        King whiteKing = new King(Color.WHITE);
        assertEquals(PieceValue.KING.getValue(), whiteKing.getValue());

        Queen whiteQueen = new Queen(Color.WHITE);
        assertEquals(PieceValue.QUEEN.getValue(), whiteQueen.getValue());

        Rook whiteRook = new Rook(Color.WHITE);
        assertEquals(PieceValue.ROOK.getValue(), whiteRook.getValue());

        Bishop whiteBishop = new Bishop(Color.WHITE);
        assertEquals(PieceValue.BISHOP.getValue(), whiteBishop.getValue());

        Knight whiteKnight = new Knight(Color.WHITE);
        assertEquals(PieceValue.KNIGHT.getValue(), whiteKnight.getValue());

        Pawn whitePawn2 = new Pawn(Color.WHITE);
        assertEquals(PieceValue.PAWN.getValue(), whitePawn2.getValue());

    }

    @Test
    public void testShouldReturnPawnIsInitialPosition(){
        Pawn pawn = new Pawn(Color.WHITE);

    }

}
