package boardgame;

import chess.ChessPiece;

public class Piece {
    protected Position position;
    private  Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public Piece setBoard(Board board) {
        this.board = board;
        return this;
    }

    //public ChessPiece createChessPiece() {
    //    return new ChessPiece(board);
    //}
}
