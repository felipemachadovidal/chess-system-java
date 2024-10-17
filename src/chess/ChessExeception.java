package chess;

public class ChessExeception extends RuntimeException{
    private static final long SerialVersionUID =1;

    public ChessExeception(String msg){
        super(msg);
    }
}
