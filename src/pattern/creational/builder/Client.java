package pattern.creational.builder;

/**
 * builder模式测试类
 * @author 七夜雪
 * 2018/11/14 13:56
 */
public class Client {

    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Person director = new Person(builder);
        Computer computer = director.excuteBuilder("酷睿I7", "金士顿 DDR4 16G", "三星512G SSD", "华硕X99");
        System.out.println(computer);
    }

}
