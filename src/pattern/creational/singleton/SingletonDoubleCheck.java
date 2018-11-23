package pattern.creational.singleton;

/**
 * 单例模式 : 双重检查
 * 防止并发情况下问题
 * @author 七夜雪
 * 2018/11/14 17:26
 */
public class SingletonDoubleCheck {
    // volatile防止指令重排序导致的线程安全问题
    private static volatile SingletonDoubleCheck singleton;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance(){
        if (null == singleton){
            synchronized (SingletonDoubleCheck.class){
                if (null == singleton) {
                    /*
                      这一行代码分成三个步骤:
                      1. 分配内存给这个对象
                      2. 初始化对象
                      3. 将singleton执行分配的内存地址
                      但是2,3两步有可能会被重排序, 执行顺序有可能是1->2->3 也有可能是1->3->2
                     */
                    singleton = new SingletonDoubleCheck();
                }
            }
        }

        return singleton;
    }
}
