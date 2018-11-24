package pattern.behavioral.memento;

/**
 * 测试
 *
 * @author 七夜雪
 * @create 2018-11-24 16:25
 */
public class Client {

    public static void main(String[] args) {
        String title = "听雪楼";
        String content = "听雪楼中听雪落, 彼岸花开彼岸零";
        Originator originator = new Originator(title, content);
        originator.print();
        title = "魔渡众生";
        content = "当神已无能为力, 便是魔渡众生";
        originator.modify(title, content);
        System.out.println("---------------分隔符----------------");
        originator.print();
        originator.setTitle("听雪江湖");
        System.out.println("---------------分隔符----------------");
        originator.print();
        originator.undo();
        System.out.println("---------------分隔符----------------");
        originator.print();
        originator.undo();
        System.out.println("---------------分隔符----------------");
        originator.print();
    }

}
