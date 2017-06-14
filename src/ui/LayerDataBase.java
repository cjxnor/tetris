package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerDataBase extends Layer {

    private static final Image IMG_DB = new ImageIcon("Graphics/string/db.png").getImage();

    public LayerDataBase(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);
        g.drawImage(IMG_DB,this.x+PADDING,this.y+PADDING,null);
    }
}
