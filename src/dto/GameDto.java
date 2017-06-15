package dto;

import entity.GameAct;

import java.util.List;

/**
 * Created by cjx on 2017/6/14.
 */
public class GameDto {

    /**
     * 数据库记录
     */
    private List<Player> dbRecord;

    /**
     * 本地记录
     */
    private List<Player> diskRecord;

    /**
     *游戏界面数组
     */
    private boolean[][] gameMap;

    /**
     *下落方块
     */
    private GameAct gameAct;

    /**
     *下一个出现的图形
     */
    private int next;

    /**
     * 等级
     */
    private int nowLevel;

    /**
     * 当前分数
     */
    private int nowScore;

    /**
     * 当前已消行数
     */
    private int nowRemoveLines;

    /**
     * 构造函数
     */
    public GameDto(){
        dtoInit();
    }

    /**
     * dto初始化
     */
    public void dtoInit(){
        //TODO  硬编码
        this.gameMap = new boolean[10][18];

        //TODO  初始化所有游戏对象
    }

    public List<Player> getDbRecord() {
        return dbRecord;
    }

    public void setDbRecord(List<Player> dbRecord) {
        this.dbRecord = dbRecord;
    }

    public List<Player> getDiskRecord() {
        return diskRecord;
    }

    public void setDiskRecord(List<Player> diskRecord) {
        this.diskRecord = diskRecord;
    }

    public boolean[][] getGameMap() {
        return gameMap;
    }

    public void setGameMap(boolean[][] gameMap) {
        this.gameMap = gameMap;
    }

    public GameAct getGameAct() {
        return gameAct;
    }

    public void setGameAct(GameAct gameAct) {
        this.gameAct = gameAct;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getNowLevel() {
        return nowLevel;
    }

    public void setNowLevel(int nowLevel) {
        this.nowLevel = nowLevel;
    }

    public int getNowScore() {
        return nowScore;
    }

    public void setNowScore(int nowScore) {
        this.nowScore = nowScore;
    }

    public int getNowRemoveLines() {
        return nowRemoveLines;
    }

    public void setNowRemoveLines(int nowRemoveLines) {
        this.nowRemoveLines = nowRemoveLines;
    }
}
