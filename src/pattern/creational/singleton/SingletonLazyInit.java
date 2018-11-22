package pattern.creational.singleton;

/**
 * 单例模式 : 懒汉模式
 *
 * @author 七夜雪
 * 2018/11/14 17:21
 */
public class SingletonLazyInit {
    private static SingletonLazyInit singleton;

    private SingletonLazyInit() {
    }

    public static SingletonLazyInit getInstance(){
        if (null == singleton){
            singleton = new SingletonLazyInit();
        }
        return singleton;
    }

}
