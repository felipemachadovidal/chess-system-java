package chess;

import boardgame.BoardExeception;

public class ChessExeception extends BoardExeception {
    private static final long SerialVersionUID =1;

    public ChessExeception(String msg){
        super(msg);
    }
}
