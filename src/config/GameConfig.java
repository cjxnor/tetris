package config;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cjx on 2017/6/12.
 */
public class GameConfig {
    /**
     * 标题
     */
    private String title;
    /**
     * 窗口拔高
     */
    private int windowUp;
    private int width;
    private int height;
    private int padding;
    private int windowSize;

    private List<LayerConfig> layerConfigs;

    public GameConfig() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("config/cfg.xml");
        Element game = doc.getRootElement();
        this.setUiConfig(game.element("frame"));
        this.setSystemConfig(game.element("system"));
        this.setDataConfig(game.element("data"));
    }

    /**
     * 配置窗口参数
     * @param frame
     */
    private void setUiConfig(Element frame){
        this.title = frame.attributeValue("title");
        this.windowUp = Integer.parseInt(frame.attributeValue("windowUp"));
        this.width = Integer.parseInt(frame.attributeValue("width"));
        this.height = Integer.parseInt(frame.attributeValue("height"));
        this.padding = Integer.parseInt(frame.attributeValue("padding"));
        this.windowSize = Integer.parseInt(frame.attributeValue("windowSize"));
        List<Element> layers = frame.elements("layer");
        layerConfigs = new ArrayList<LayerConfig>();
        for(Element l:layers){
            LayerConfig lc = new LayerConfig(
                    l.attributeValue("className"),
                    Integer.parseInt(l.attributeValue("x")),
                    Integer.parseInt(l.attributeValue("y")),
                    Integer.parseInt(l.attributeValue("w")),
                    Integer.parseInt(l.attributeValue("h"))
            );
            layerConfigs.add(lc);
        }

    }

    /**
     *配置系统参数
     * @param system
     */
    private void setSystemConfig(Element system){
        //TODO
    }

    /**
     *配置数据访问参数
     * @param data
     */
    private void setDataConfig(Element data){
        //TODO
    }

    public String getTitle() {
        return title;
    }

    public int getWindowUp() {
        return windowUp;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPadding() {
        return padding;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public List<LayerConfig> getLayerConfigs() {
        return layerConfigs;
    }
}
