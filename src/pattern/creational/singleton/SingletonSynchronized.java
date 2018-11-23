package pattern.creational.singleton;

/**
 * 单例模式 : 加锁单例
 *
 * @author 七夜雪
 * 2018/11/14 17:21
 */
public class SingletonSynchronized {
    private static SingletonSynchronized singleton;

    private SingletonSynchronized() {
    }

    // 写法一
    public static synchronized SingletonSynchronized getInstance(){
        if (null == singleton){
            singleton = new SingletonSynchronized();
        }
        return singleton;
    }

      // 写法二
//    public static synchronized SingletonSynchronized getInstance(){
//        synchronized (SingletonSynchronized.class){
//            if (null == singleton){
//                singleton = new SingletonSynchronized();
//            }
//        }
//        return singleton;
//    }

}
