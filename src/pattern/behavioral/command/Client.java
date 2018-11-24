package pattern.behavioral.command;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-24 18:29
 */
public class Client {

    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);
        Person.addCommand(on);
        Person.addCommand(off);
        Person.excute();
    }

}
