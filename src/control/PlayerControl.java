package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cjx on 2017/6/13.
 */
public class PlayerControl extends KeyAdapter {

    private GameControl gamectl;

    public PlayerControl(GameControl gamectl){

        this.gamectl = gamectl;
    }


    /**
     * 键盘按下事件
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {
        //  TODO 这样的枚举写法不好
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                this.gamectl.keyUp();
                break;
            case KeyEvent.VK_DOWN:
                this.gamectl.keyDown();
                break;
            case KeyEvent.VK_LEFT:
                this.gamectl.keyLeft();
                break;
            case KeyEvent.VK_RIGHT:
                this.gamectl.keyRight();
                break;

            default:break;

        }
    }

}
