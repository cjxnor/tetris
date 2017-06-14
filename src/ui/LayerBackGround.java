package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerBackGround extends Layer {

    private static final Image IMG_BG = new ImageIcon("Graphics/background/bg01.jpg").getImage();


    public LayerBackGround(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        g.drawImage(IMG_BG,0,0,1200,700,null);
    }
}
