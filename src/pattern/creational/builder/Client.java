package pattern.creational.builder;

/**
 * builder模式测试类
 * @author 七夜雪
 * 2018/11/14 13:56
 */
public class Client {

    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilder();
        Director director = new Director(builder);
        director.excuteBuilder();
        Computer computer = builder.getComputer();
        System.out.println(computer);
    }

}
