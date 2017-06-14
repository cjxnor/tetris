package config;

import org.dom4j.DocumentException;

/**
 * Created by cjx on 2017/6/12.
 */
public class ConfigFactory {
    private static GameConfig GAME_CONFIG = null;

    static {
        try {
            GAME_CONFIG = new GameConfig();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static GameConfig getGameConfig(){
        return GAME_CONFIG;
    }
}
