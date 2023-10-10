package Chess;

import java.util.LinkedList;

public class Piece {
    int xp;
    int yp;
    boolean isWhite;
    LinkedList<Piece> ps;
    String name;


    public Piece(int xp, int yp, boolean iswhite, LinkedList<Piece> ps, String n){
        this.xp = xp;
        this.yp = yp;
        this.isWhite = iswhite;
        this.ps = ps;
        this.name= n;
        ps.add(this);
    }
    public void move(int xp, int yp){
       for(Piece p: ps){
           if(p.xp==xp&&p.yp==yp){
               p.kill();
           }
       }
        this.xp=xp;
        this.yp = yp;
    }

    public void kill(){
        ps.remove(this);
    }

}
