package pattern.creational.prototype;

import java.util.Date;

/**
 * 测试类
 * @author 七夜雪
 * 2018/11/14 17:05
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 原型
        Person prototype = new Person();
        prototype.setName("萧忆情");
        prototype.setAddress("洛阳");
        prototype.setCompany("听雪楼");
        prototype.setAge(18);
        prototype.setBirthday(new Date());
        Person clone = (Person)prototype.clone();
        System.out.println("原型:" + prototype);
        System.out.println("拷贝:" + clone);
        clone.getBirthday().setTime(211111212121L);
        System.out.println("--------------更新了clone对象的birthday属性---------------");
        System.out.println("原型:" + prototype);
        System.out.println("拷贝:" + clone);
    }

}
