package pattern.behavioral.visitor;

/**
 * @author 七夜雪
 * @create 2018-11-24 21:37
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("访问者姓名 : " + element.getName());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("访问者姓名 : " + element.getName() + ", 江湖人称 : " + element.getNickname());
    }
}
