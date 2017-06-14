package main;

import control.GameControl;
import control.PlayerControl;
import dto.GameDto;
import service.GameService;
import ui.FrameGame;
import ui.PanelGame;

/**
 * Created by cjx on 2017/6/9.
 */
public class Main {

    public static void main(String[] args){

        //创建游戏数据源
        GameDto gameDto = new GameDto();
        //创建游戏逻辑控制块（安装游戏数据源）
        GameService gameService = new GameService(gameDto);
        //创建游戏面板
        PanelGame panelGame = new PanelGame(gameDto);
        //创建游戏控制器（链接游戏面板和游戏逻辑块）
        GameControl gameControl = new GameControl(panelGame,gameService);
        //创建玩家控制器（链接游戏控制器）
        PlayerControl playerControl = new PlayerControl(gameControl);
        //安装玩家控制器
        panelGame.setGameControl(playerControl);
        //创建游戏窗口（安装游戏面板）
        FrameGame framegame = new FrameGame(panelGame);

    }
}
