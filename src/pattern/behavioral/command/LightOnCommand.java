package pattern.behavioral.command;

/**
 * 开灯命令
 *
 * @author 七夜雪
 * @create 2018-11-24 18:18
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.lightOn();
    }
}
