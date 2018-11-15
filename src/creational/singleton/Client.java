package creational.singleton;

/**
 * 单例模式测试类
 *
 * @author xuxiumeng
 * 2018/11/15 10:06
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        SingletonLazyInit singleton3 = SingletonLazyInit.getInstance();
        SingletonLazyInit singleton4 = SingletonLazyInit.getInstance();
        SingletonDoubleCheck singleton5 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singleton6 = SingletonDoubleCheck.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton3 == singleton4);
        System.out.println(singleton5 == singleton6);

    }

}
