package boardgame;

public class BoardExeception extends RuntimeException{
    private static final long SerialVersionUID =1;

    public BoardExeception(String msg){
        super(msg);
    }
}
