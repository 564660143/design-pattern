package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 21:48
 */
public class Client {

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        Element elementA = new ConcreteElementA("七夜雪");
        Element elementB = new ConcreteElementB("杨过", "神雕大侠");
        elements.add(elementA);
        elements.add(elementB);
        for (Element element : elements) {
            element.accept(new ConcreteVisitor());
        }
    }

}
