package ui;

import config.ConfigFactory;
import config.GameConfig;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;

/**
 * Created by cjx on 2017/6/9.
 */
public class FrameGame extends JFrame{

    public FrameGame(PanelGame panelGame){

        GameConfig cfg = ConfigFactory.getGameConfig();

        //设置标题
        this.setTitle(cfg.getTitle());
        //设置默认关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口大小
        this.setSize(cfg.getWidth(),cfg.getHeight());
        //不允许改变窗口大小
        this.setResizable(false);
        //设置窗口居中
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        this.setLocation(screen.width-cfg.getWidth()>>1,(screen.height-cfg.getHeight()>>1)-cfg.getWindowUp());

        //设置默认Panel
        this.setContentPane(panelGame);

        this.setVisible(true);
    }

}
