package pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 七夜雪
 * @create 2018-11-24 15:10
 */
public class QQ implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Qzone qzone = (Qzone) o;
        Dynamic dynamic = (Dynamic) arg;
        System.out.println(qzone.getName() + " 发布了一条动态 :" + dynamic.getContent());
    }
}
