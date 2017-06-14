package entity;

import java.awt.*;

/**
 * Created by cjx on 2017/6/14.
 */
public class GameAct {

    private Point[] actPoints;

    public GameAct() {
        this.actPoints = new Point[]{
                new Point(3,0),
                new Point(4,0),
                new Point(5,0),
                new Point(5,1)
        };
    }

    public Point[] getActPoints() {
        return actPoints;
    }

    /**
     * 方块移动方法
     * @param pointMoveX    X轴偏移量
     * @param pointMoveY    Y轴偏移量
     */
    public void PointMove(int pointMoveX,int pointMoveY){

        for(Point p:actPoints){
            p.x += pointMoveX;
            p.y += pointMoveY;
        }

    }
}
