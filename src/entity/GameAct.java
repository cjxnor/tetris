package entity;

import java.awt.*;

/**
 * Created by cjx on 2017/6/14.
 */
public class GameAct {


    /**
     * 方块数组
     */
    private Point[] actPoints;

    private static int MIN_X = 0;

    private static int MAX_X = 9;

    private static int MIN_Y = 0;

    private static int MAX_Y = 17;



    public GameAct() {
        this.actPoints = new Point[]{
                new Point(4,0),
                new Point(3,0),
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
    public boolean PointMove(int pointMoveX,int pointMoveY){

        for(Point p : actPoints){
            int newX = p.x + pointMoveX;
            int newY = p.y + pointMoveY;
            if(this.isOverMap(newX,newY)){
                return false;
            }

        }
        for(Point p : actPoints){
            p.x += pointMoveX;
            p.y += pointMoveY;
        }
        return true;
    }

    /**
     * 方块旋转
     * 顺时针：
     * A.x = O.y + O.x - B.y
     * A.y = O.y - O.x + B.x
     * O是中心方块，B是待旋转方块，A是旋转后的方块
     */
    public void round(){

        for(int i = 1; i < actPoints.length; i++){
            int newX = actPoints[0].y + actPoints[0].x - actPoints[i].y;
            int newY = actPoints[0].y - actPoints[0].x + actPoints[i].x;
            //  是否可旋转
            if(this.isOverMap(newX,newY)){
                return;
            }
        }
        for(int i1 = 0; i1 < actPoints.length; i1++){
            int newX1 = actPoints[0].y + actPoints[0].x - actPoints[i1].y;
            int newY1 = actPoints[0].y - actPoints[0].x + actPoints[i1].x;
            actPoints[i1].x = newX1;
            actPoints[i1].y = newY1;
        }
    }

    private boolean isOverMap(int x, int y){
        return x < MIN_X || x > MAX_X || y < MIN_Y || y > MAX_Y;
    }
}
