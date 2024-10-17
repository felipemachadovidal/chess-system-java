package boardgame;

public class Board {
    private int rows;
    private  int columns;
    private Piece[][] pieces;

    public Board(int rows, int column) {
        if(rows<1 || column<1){
            throw new BoardExeception("Error creating board: is necessary have at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = column;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }


    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if (!PositionExists(row,column)){
            throw new BoardExeception("position out of board");

        }
        return pieces [row] [column];
    }
    public Piece piece(Position position) {
        if (!PositionExists(position)) {
            throw new BoardExeception("position out of board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(ThereIsAPiece(position)){
            throw new BoardExeception("There is already a piece in the position: "+ position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean PositionExists(int row, int column){
        return row >= 0 && row< rows && column>= 0 && column< columns;

    }

    public boolean PositionExists(Position position){
        return PositionExists(position.getRow(), position.getColumn());

    }

    public boolean ThereIsAPiece(Position position){
        if (!PositionExists(position)) {
            throw new BoardExeception("position out of board");
        }
        return piece(position) != null;



    }


}
