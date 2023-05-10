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
        assertEquals( PieceType.PAWN.getValue(), piece.getValue());

        // Black pieces
        King blackKing = new King(Color.BLACK);
        assertEquals(PieceType.KING.getValue(), blackKing.getValue());

        Queen blackQueen = new Queen(Color.BLACK);
        assertEquals(PieceType.QUEEN.getValue(), blackQueen.getValue());

        Rook blackRook = new Rook(Color.BLACK);
        assertEquals(PieceType.ROOK.getValue(), blackRook.getValue());

        Bishop blackBishop = new Bishop(Color.BLACK);
        assertEquals(PieceType.BISHOP.getValue(), blackBishop.getValue());

        Knight knightBlack = new Knight(Color.BLACK);
        assertEquals(PieceType.KNIGHT.getValue(), knightBlack.getValue());

        Pawn pawnblack = new Pawn(Color.BLACK);
        assertEquals(PieceType.PAWN.getValue(), pawnblack.getValue());

        // White pieces
        King whiteKing = new King(Color.WHITE);
        assertEquals(PieceType.KING.getValue(), whiteKing.getValue());

        Queen whiteQueen = new Queen(Color.WHITE);
        assertEquals(PieceType.QUEEN.getValue(), whiteQueen.getValue());

        Rook whiteRook = new Rook(Color.WHITE);
        assertEquals(PieceType.ROOK.getValue(), whiteRook.getValue());

        Bishop whiteBishop = new Bishop(Color.WHITE);
        assertEquals(PieceType.BISHOP.getValue(), whiteBishop.getValue());

        Knight whiteKnight = new Knight(Color.WHITE);
        assertEquals(PieceType.KNIGHT.getValue(), whiteKnight.getValue());

        Pawn whitePawn2 = new Pawn(Color.WHITE);
        assertEquals(PieceType.PAWN.getValue(), whitePawn2.getValue());

    }

    @Test
    public void testShouldReturnPawnIsInitialPosition(){
        Pawn pawn = new Pawn(Color.WHITE);

    }

}
