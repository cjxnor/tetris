package ui;

import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerButton extends Layer {

    public LayerButton(int x, int y, int w, int h){
        super(x,y,w,h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);
    }
}
