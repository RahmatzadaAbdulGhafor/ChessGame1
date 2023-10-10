package Chess;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class ChessGUI {
    ChessGUI() throws IOException {
        LinkedList<Piece> ps = new LinkedList<>();
        JFrame frame = new JFrame();
        frame.setBounds(10,10,512,512);
        frame.setUndecorated(true);

        BufferedImage all= ImageIO.read(new File("C:\\Users\\Ghafo\\Desktop\\projects\\ChessGame1\\images\\chessPieces.png"));
        Image imgs[]=new Image[12];
        int ind=0;
        for(int y=0;y<400;y+=200){
            for(int x=0;x<1200;x+=200){
                imgs[ind]=all.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
        }
        JPanel pn = new JPanel(){
            @Override
            public void paint(Graphics g){
                boolean white=true;
                for(int y = 0;y<8;y++){
                    for(int x=0; x<8; x++){
                        if(white){
                            g.setColor(Color.white);
                        }else{
                            g.setColor(Color.darkGray);
                        }
                        g.fillRect(x*64,y*64,64,64);
                        white = !white;
                    }

                    white = !white;
                }

                for(Piece p: ps){
                    int ind=0;
                    if(p.name.equalsIgnoreCase("king")){
                        ind=0;
                    }
                    if(p.name.equalsIgnoreCase("queen")){
                        ind=1;
                    }
                    if(p.name.equalsIgnoreCase("bishop")){
                        ind=2;
                    }
                    if(p.name.equalsIgnoreCase("knight")){
                        ind=3;
                    }
                    if(p.name.equalsIgnoreCase("rook")){
                        ind=4;
                    }
                    if(p.name.equalsIgnoreCase("pawn")){
                        ind=5;
                    }
                    if(!p.isWhite){
                        ind+=6;
                    }
                    g.drawImage(imgs[ind], p.xp*64, p.yp*64, this);
                }


            }
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("SHUSH");
    }

}