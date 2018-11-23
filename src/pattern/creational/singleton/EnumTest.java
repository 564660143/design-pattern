package pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 枚举类型单例测试
 *
 * @author 七夜雪
 * @create 2018-11-23 0:23
 */
public class EnumTest {
    /**
     * 使用序列化方式破坏单例
     * @param args
     * @throws Exception
     */
    public static void main1(String[] args) throws Exception {
        System.out.println("----------测试序列化方法对单例的破坏----------");
        EnumSingleton instance = EnumSingleton.getInstance();
        // 同时设置一个Object对象, 看下反序列化之后有没有被破坏
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sinleton.dat"));
        oos.writeObject(instance);
        File file = new File("sinleton.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
        System.out.println(instance.getData() == newInstance.getData());
    }


    /**
     * 使用序列化方式破坏单例
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("----------测试序列化方法对单例的破坏----------");
        EnumSingleton instance = EnumSingleton.getInstance();
        Constructor constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumSingleton newInstance = (EnumSingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
