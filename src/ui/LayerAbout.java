package ui;

import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerAbout extends Layer {

    public LayerAbout(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);
    }

}
