package creational.prototype;

/**
 * 测试类
 * @author xuxiumeng
 * 2018/11/14 17:05
 */
public class Client {

    public static void main(String[] args) {
        // 原型
        PersonPrototype prototype = new PersonPrototype();
        prototype.setName("萧忆情");
        prototype.setAddress("洛阳");
        prototype.setCompany("听雪楼");
        prototype.setJob("楼主");
        System.out.println("原型:" + prototype);
        PersonPrototype clone = (PersonPrototype)prototype.clone();
        System.out.println("拷贝:" + clone);
        clone.setJob("护法");
        clone.setName("碧落");
        System.out.println("更新:" + clone);
    }

}
