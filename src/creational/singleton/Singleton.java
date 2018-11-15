package creational.singleton;

/**
 * 单例模式 : 饿汉模式
 * @author xuxiumeng
 * 2018/11/14 17:13
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
