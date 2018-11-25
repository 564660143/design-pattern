package pattern.behavioral.visitor;

/**
 * 访问者接口
 *
 * @author 七夜雪
 * @create 2018-11-24 21:29
 */
public interface Visitor {
    public void visit(ConcreteElementA element);
    public void visit(ConcreteElementB element);
}
