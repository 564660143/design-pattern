package pattern.behavioral.visitor;

/**
 * 具体元素A
 * @author 七夜雪
 * @create 2018-11-24 21:36
 */
public class ConcreteElementA implements Element {
    private String name;

    public ConcreteElementA(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
