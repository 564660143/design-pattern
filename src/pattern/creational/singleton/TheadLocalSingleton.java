package pattern.creational.singleton;

/**
 * 线程单例-伪单例
 *
 * @author 七夜雪
 * @create 2018-11-23 9:42
 */
public class TheadLocalSingleton {
    private final static ThreadLocal<TheadLocalSingleton> threadLocal = new ThreadLocal<TheadLocalSingleton>(){
        @Override
        protected TheadLocalSingleton initialValue() {
            return new TheadLocalSingleton();
        }
    };

    public TheadLocalSingleton() {
    }

    public static TheadLocalSingleton getInstance(){
        return threadLocal.get();
    }

}
