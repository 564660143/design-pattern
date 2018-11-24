package pattern.behavioral.mediator;

/**
 * 群聊类-中介者模式中的ConcreteMediator(具体中介者)角色
 *
 * @author 七夜雪
 * @create 2018-11-24 18:57
 */
public class GroupMediator implements Mediator {

    @Override
    public void sendMsg(User user, String msg) {
        System.out.println(user.getName() + " : " + msg);
    }
}
