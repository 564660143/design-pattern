package pattern.behavioral.observer;

import java.util.Observable;

/**
 * QQ空间
 * 继承Observable称为被观察者
 * @author 七夜雪
 * @create 2018-11-24 15:07
 */
public class Qzone extends Observable {

    private String name;

    public Qzone(String name) {
        this.name = name;
    }

    /**
     * 发布一条动态
     * @return
     */
    public void publishDynamic(String content){
        Dynamic dynamic = new Dynamic(content);
        setChanged();
        notifyObservers(dynamic);
    }

    public String getName() {
        return name;
    }
}
