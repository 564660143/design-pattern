package creational.singleton;

/**
 * 单例模式 : 双重检查
 * 防止并发情况下问题
 * @author xuxiumeng
 * 2018/11/14 17:26
 */
public class SingletonDoubleCheck {
    private static SingletonDoubleCheck singleton;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance(){
        if (null == singleton){
            synchronized (SingletonDoubleCheck.class){
                if (null == singleton) {
                    singleton = new SingletonDoubleCheck();
                }
            }
        }

        return singleton;
    }
}
