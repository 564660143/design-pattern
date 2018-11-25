package pattern.behavioral.visitor;

/**
 * @author 七夜雪
 * @create 2018-11-24 21:36
 */
public interface Element {
    public void accept(Visitor visitor);
}
