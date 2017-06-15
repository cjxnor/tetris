package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerGame extends Layer {

    private static final Image ACT_RECT = new ImageIcon("Graphics/game/rect.png").getImage();

    //TODO  配置文件
    private static int ACT_SIZE = 32;

    public LayerGame(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);

        Point[] points = this.gameDto.getGameAct().getActPoints();

        //打印方块
        for(Point p:points){
            g.drawImage(ACT_RECT, this.x+p.x*ACT_SIZE+7, this.y+p.y*ACT_SIZE+7,
                    this.x+(p.x+1)*ACT_SIZE+7,this.y+(p.y+1)*ACT_SIZE+7,
                    32,0,64,32,null);
        }

        //打印地图
        boolean[][] gameMap = this.gameDto.getGameMap();

        for(int x = 0; x < gameMap.length; x++){
            for (int y = 0; y < gameMap[x].length; y++){
                if(gameMap[x][y]) {
                    g.drawImage(ACT_RECT, this.x + x * ACT_SIZE + 7, this.y + y * ACT_SIZE + 7,
                            this.x + (x + 1) * ACT_SIZE + 7, this.y + (y + 1) * ACT_SIZE + 7,
                            0, 0, 32, 32, null);
                }
            }
        }


    }
}
