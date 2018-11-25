package pattern.behavioral.visitor;

/**
 * 具体元素B
 * @author 七夜雪
 * @create 2018-11-24 21:37
 */
public class ConcreteElementB implements Element {
    private String name;
    private String nickname;

    public ConcreteElementB(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
