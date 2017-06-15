package service;

import dto.GameDto;
import entity.GameAct;

import java.awt.*;

/**
 * Created by cjx on 2017/6/13.
 */
public class GameService {

    private GameDto gameDto;

    public GameService(GameDto gameDto) {

        this.gameDto = gameDto;
        GameAct gameAct =new GameAct();
        gameDto.setGameAct(gameAct);
    }

    /**
     * 控制器方向键（上）
     */
    public void keyUp() {

        //旋转
        this.gameDto.getGameAct().round();
    }

    /**
     * 控制器方向键（下）
     */
    public void keyDown() {

        //移动处理
        if(!this.gameDto.getGameAct().PointMove(0, 1)){
            //获得游戏地图对象
            boolean[][] gameMap = this.gameDto.getGameMap();
            Point[] gamePoint = this.gameDto.getGameAct().getActPoints();

            for (Point p : gamePoint ){
                gameMap[p.x][p.y] = true;
            }


        }


    }

    /**
     * 控制器方向键（左）
     */
    public void keyLeft() {

        //移动处理
        this.gameDto.getGameAct().PointMove(-1, 0);


    }

    /**
     * 控制器方向键（右）
     */
    public void keyRight() {

        //移动处理
        this.gameDto.getGameAct().PointMove(1, 0);

    }


}
