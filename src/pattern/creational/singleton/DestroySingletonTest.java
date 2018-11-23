package pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 破坏单例模式的测试
 *
 * @author 七夜雪
 * @create 2018-11-22 21:51
 */
public class DestroySingletonTest {

    /**
     * 使用反射方式破坏单例
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        Class clazz = Singleton.class;
        // 获取构造方法
        Constructor constructor = clazz.getDeclaredConstructor();
        // 由于构造方法是私有的, 所以这里先开放权限
        constructor.setAccessible(true);
        Singleton newInstance = (Singleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }


    /**
     * 使用序列化方式破坏单例
     * @param args
     * @throws Exception
     */
    public static void main1(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sinleton.dat"));
        oos.writeObject(instance);
        oos.close();
        File file = new File("sinleton.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

}
