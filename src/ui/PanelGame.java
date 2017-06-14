package ui;

import config.ConfigFactory;
import config.GameConfig;
import config.LayerConfig;
import control.GameControl;
import control.PlayerControl;
import dto.GameDto;
import service.GameService;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.List;

/**
 * Created by cjx on 2017/6/9.
 */
public class PanelGame extends JPanel{


    private List<Layer> layers = null;

    private GameDto gameDto = null;

    public PanelGame(GameDto gameDto){

        //获得dto对象
        this.gameDto = gameDto;
        //初始化组件
        initComponent();
        //初始化层
        initLayer();

    }

    public void setGameControl(PlayerControl playerControl){
        this.addKeyListener(playerControl);
    }

    /**
     * 初始化组件
     */
    private void initComponent(){

    }

    /**
     * 层初始化
     */
    private void initLayer(){
        //获得游戏配置
        GameConfig cfg = ConfigFactory.getGameConfig();
        //获得层配置
        List<LayerConfig> layerCfg = cfg.getLayerConfigs();
        layers = new ArrayList<Layer>(layerCfg.size());

        for(LayerConfig lcf:layerCfg){
            try{
                //获得类对象
                Class<?> cls = Class.forName(lcf.getClassName());
                //获得构造函数
                Constructor<?> ctr = cls.getConstructor(int.class,int.class,int.class,int.class);
                //调用构造函数创建对象
                Layer layer = (Layer)ctr.newInstance(
                        lcf.getX(),lcf.getY(),lcf.getW(),lcf.getH()
                );
                //设置游戏数据对象
                layer.setGameDto(this.gameDto);
                //把创建的Layer对象放入List
                layers.add(layer);

            }catch (Exception e){
                e.printStackTrace();
            }

        }


//        layers = new Layer[]{
//                new LayerBackGround(0,0,0,0),
//                new LayerDataBase(40,32,334,279),
//                new LayerDisk(40,343,334,279),
//                new LayerGame(414,32,334,590),
//                new LayerButton(788,32,334,124),
//                new LayerNext(788,188,176,148),
//                new LayerLevel(964,188,158,148),
//                new LayerPoint(788,368,334,200),
//                new LayerAbout(788,600,334,54)
//        };

    }


    @Override
    public void  paintComponent(Graphics g){
        //调用基类方法
        super.paintComponent(g);
        //循环刷新游戏画面
        for (Layer l: layers){
            l.paint(g);
        }
        //获得焦点
        this.requestFocus();

    }

}
