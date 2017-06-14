package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjx on 2017/6/11.
 */
public class LayerDisk extends Layer {

    private static final Image IMG_DISK = new ImageIcon("Graphics/string/disk.png").getImage();


    public LayerDisk(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    public void paint(Graphics g){
        this.createWindow(g);
        g.drawImage(IMG_DISK,this.x+PADDING,this.y+PADDING,null);
    }
}
