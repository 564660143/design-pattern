package pattern.behavioral.command;

/**
 * 命令模式中的Receiver
 *
 * @author 七夜雪
 * @create 2018-11-24 18:18
 */
public class Light {

    public void lightOn(){
        System.out.println("开灯...");
    }

    public void lightOff(){
        System.out.println("关灯...");
    }

}
