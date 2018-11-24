package pattern.behavioral.mediator;

/**
 * 用户类-中介者模式中的Colleague class
 *
 * @author 七夜雪
 * @create 2018-11-24 18:56
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
