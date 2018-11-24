package pattern.behavioral.chainofresponsibility;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 19:31
 */
public class Client {

    public static void main(String[] args) {
        User user = new User("七夜雪", "123456");
        Handler handler1 = new NameCheckHandler();
        Handler handler2 = new PwdCheckHandler();
        handler1.setNextHandler(handler2);
        handler1.check(user);
        user.setName(null);
        System.out.println("---------分隔符----------");
        handler1.check(user);
    }

}
