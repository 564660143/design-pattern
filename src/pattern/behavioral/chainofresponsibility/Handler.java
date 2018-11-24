package pattern.behavioral.chainofresponsibility;


/**
 * @author 七夜雪
 * @create 2018-11-24 19:24
 */
public interface Handler {

    public void check(User user);

    public void setNextHandler(Handler handler);

}
