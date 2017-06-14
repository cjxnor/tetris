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

        //移动处理
        if(canMove(0,-1)) {
            this.gameDto.getGameAct().PointMove(0, -1);
        }
    }

    /**
     * 控制器方向键（下）
     */
    public void keyDown() {

        //移动处理
        if(canMove(0,1)) {
            this.gameDto.getGameAct().PointMove(0, 1);
        }

    }

    /**
     * 控制器方向键（左）
     */
    public void keyLeft() {

        //移动处理
        if(canMove(-1,0)) {
            this.gameDto.getGameAct().PointMove(-1, 0);
        }

    }

    /**
     * 控制器方向键（右）
     */
    public void keyRight() {

        //移动处理
        if(canMove(1,0)) {
            this.gameDto.getGameAct().PointMove(1, 0);
        }

    }

    private boolean canMove(int pointMoveX,int pointMoveY){

        Point[] points = this.gameDto.getGameAct().getActPoints();

        for(Point p : points){
            int newX = p.x + pointMoveX;
            int newY = p.y + pointMoveY;
            //TODO  配置
            if(newX < 0 || newX > 9 || newY < 0 || newY > 17)
                return false;
        }
        return true;
    }
}
