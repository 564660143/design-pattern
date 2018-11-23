package pattern.creational.singleton;

/**
 * 单例模式 : 静态代码块饿汉模式
 *
 * @author 七夜雪
 * 2018/11/14 17:13
 */
public class StaticHungrySingleton {
    private static StaticHungrySingleton instance;

    static {
        instance = new StaticHungrySingleton();
    }

    public static StaticHungrySingleton getInstance() {
        return instance;
    }

    private StaticHungrySingleton() {
    }
}
