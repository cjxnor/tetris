package ui;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

import javax.swing.*;
import java.awt.*;

/**
 * 绘制窗口
 * Created by cjx on 2017/6/10.
 */
abstract public class Layer {

    protected static final int PADDING;

    private static final int SIZE;

    static {
        GameConfig cfg = ConfigFactory.getGameConfig();
        PADDING = cfg.getPadding();
        SIZE = cfg.getWindowSize();

    }

    private static final Image WINDOW_IMG = new ImageIcon("Graphics/window/window.png").getImage();

    private static final int WINDOW_W = WINDOW_IMG.getWidth(null);

    private static final int WINDOW_H = WINDOW_IMG.getHeight(null);


    /**
     * 窗口左上角距面板左上角的x坐标
     */
    protected int x;

    /**
     * 窗口左上角距面板左上角的y坐标
     */
    protected int y;

    /**
     * 窗口宽度
     */
    protected int w;

    /**
     * 窗口高度
     */
    protected int h;

    /**
     * 游戏数据
     */
    protected GameDto gameDto = null;

    protected Layer(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

    }

    /**
     * 绘制窗口的方法
     */
    protected void createWindow(Graphics g){

        //上左
        g.drawImage(WINDOW_IMG,x,y,x+SIZE,y+SIZE,0,0,SIZE,SIZE,null);
        //上中
        g.drawImage(WINDOW_IMG,x+SIZE,y,x+w-SIZE,y+SIZE,SIZE,0,WINDOW_W-SIZE,SIZE,null);
        //上右
        g.drawImage(WINDOW_IMG,x+w-SIZE,y,x+w,y+SIZE,WINDOW_W-SIZE,0,WINDOW_W,SIZE,null);
        //中左
        g.drawImage(WINDOW_IMG,x,y+SIZE,x+SIZE,y+h-SIZE,0,SIZE,SIZE,WINDOW_H-SIZE,null);
        //中中
        g.drawImage(WINDOW_IMG,x+SIZE,y+SIZE,x+w-SIZE,y+h-SIZE,SIZE,SIZE,WINDOW_W-SIZE,WINDOW_H-SIZE,null);
        //中右
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+SIZE,x+w,y+h-SIZE,WINDOW_W-SIZE,SIZE,WINDOW_W,WINDOW_H-SIZE,null);
        //下左
        g.drawImage(WINDOW_IMG,x,y+h-SIZE,x+SIZE,y+h,0,WINDOW_H-SIZE,SIZE,WINDOW_H,null);
        //下中
        g.drawImage(WINDOW_IMG,x+SIZE,y+h-SIZE,x+w-SIZE,y+h,SIZE,WINDOW_H-SIZE,WINDOW_W-SIZE,WINDOW_H,null);
        //下右
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+h-SIZE,x+w,y+h,WINDOW_W-SIZE,WINDOW_H-SIZE,WINDOW_W,WINDOW_H,null);

    }

    /**
     * 刷新游戏具体窗口
     * @author CJX
     * @param g 画笔
     */
    abstract public void paint(Graphics g);

    public void setGameDto(GameDto gameDto) {
        this.gameDto = gameDto;
    }
}
