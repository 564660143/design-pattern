package pattern.behavioral.state;

/**
 * 停止状态
 * ConcreteState subclasses(具体状态子类)
 * @author 七夜雪
 * @create 2018-11-25 9:35
 */
public class StopState implements State {

    @Override
    public void play(Player player) {
        player.setState(StateEnum.PLAY);
    }

    @Override
    public void pause(Player player) {
        System.err.println("停止状态不能暂停...");
    }

    @Override
    public void speed(Player player) {
        System.err.println("停止状态不能加速播放...");
    }

    @Override
    public void stop(Player player) {
        player.setState(StateEnum.STOP);
    }
}
