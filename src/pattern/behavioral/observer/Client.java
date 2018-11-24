package pattern.behavioral.observer;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 15:25
 */
public class Client {

    public static void main(String[] args) {
        Qzone qzone = new Qzone("七夜雪");
        QQ qq = new QQ();
        qzone.addObserver(qq);
        qzone.publishDynamic("听雪楼中听雪落, 彼岸花开彼岸零");

    }

}
