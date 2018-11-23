package pattern.creational.singleton;

import java.io.Serializable;

/**
 * 单例模式 : 饿汉模式
 * @author 七夜雪
 * 2018/11/14 17:13
 */
public class Singleton implements Serializable {
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {
        // 防止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("单例构造器不允许反射调用");
        }
    }

    /**
     * 防止序列化破坏单例
     * @return
     */
    public Object readResolve(){
        return instance;
    }
}
