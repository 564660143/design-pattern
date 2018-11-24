package pattern.behavioral.command;

/**
 * @author 七夜雪
 * @create 2018-11-24 18:20
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.lightOff();
    }
}
