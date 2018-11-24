package pattern.behavioral.mediator;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 18:59
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new GroupMediator();
        User user1 = new User("萧忆情");
        User user2 = new User("舒靖容");
        mediator.sendMsg(user1, "听雪楼中听雪落");
        mediator.sendMsg(user2, "彼岸花开彼岸零");
    }

}
