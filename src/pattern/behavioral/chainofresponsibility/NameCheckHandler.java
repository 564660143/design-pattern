package pattern.behavioral.chainofresponsibility;

/**
 * 用户名校验
 *
 * @author 七夜雪
 * @create 2018-11-24 19:24
 */
public class NameCheckHandler implements Handler {

    private Handler handler;

    @Override
    public void check(User user) {
        if (null == user.getName() || "".equals(user.getName())){
            System.out.println("用户名为空 : 流程结束");
        } else {
            System.out.println("用户名不为空 : 正确");
            if (null != handler) {
                handler.check(user);
            } else {
                System.out.println("校验完毕 : 流程结束");
            }
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
