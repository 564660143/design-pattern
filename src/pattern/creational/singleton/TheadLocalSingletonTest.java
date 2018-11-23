package pattern.creational.singleton;

/**
 * 线程单例测试
 *
 * @author 七夜雪
 * @create 2018-11-23 9:46
 */
public class TheadLocalSingletonTest {

    public static void main(String[] args) {
        TheadLocalSingleton instance = TheadLocalSingleton.getInstance();
        TheadLocalSingleton newInstance = TheadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "---" + instance);
        System.out.println(Thread.currentThread().getName() + "---" + newInstance);
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "---" + TheadLocalSingleton.getInstance());
        }).start();
    }

}
