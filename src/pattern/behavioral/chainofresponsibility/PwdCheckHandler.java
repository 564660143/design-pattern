package pattern.behavioral.chainofresponsibility;

/**
 * 密码校验类
 *
 * @author 七夜雪
 * @create 2018-11-24 19:29
 */
public class PwdCheckHandler implements Handler {
    private Handler handler;

    @Override
    public void check(User user) {
        if (null == user.getPwd() || "".equals(user.getPwd())){
            System.out.println("密码为空 : 流程结束");
        } else {
            System.out.println("密码不为空 : 正确");
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
