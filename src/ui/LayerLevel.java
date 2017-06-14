package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerLevel extends Layer {

    private static final Image IMG_LEVEL = new ImageIcon("Graphics/string/level.png").getImage();


    public LayerLevel(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);
        g.drawImage(IMG_LEVEL,this.x+PADDING,this.y+PADDING,null);
    }
}
