package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerGame extends Layer {

    private static final Image ACT_RECT = new ImageIcon("Graphics/game/rect.png").getImage();

    private static int ACT_SIZE = 32;

    public LayerGame(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);

        Point[] points = this.gameDto.getGameAct().getActPoints();

        for(Point p:points){
            g.drawImage(ACT_RECT, this.x+p.x*ACT_SIZE+7, this.y+p.y*ACT_SIZE+7,
                    this.x+(p.x+1)*ACT_SIZE+7,this.y+(p.y+1)*ACT_SIZE+7,
                    32,0,64,32,null);
        }



    }
}
