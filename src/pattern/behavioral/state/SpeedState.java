package pattern.behavioral.state;

/**
 * 加速播放状态
 * ConcreteState subclasses(具体状态子类)
 *
 * @author 七夜雪
 * @create 2018-11-25 9:35
 */
public class SpeedState implements State {

    @Override
    public void play(Player player) {
        player.setState(StateEnum.PLAY);
    }

    @Override
    public void pause(Player player) {
        player.setState(StateEnum.PAUSE);
    }

    @Override
    public void speed(Player player) {
        System.out.println("视频加速播放中...");
    }

    @Override
    public void stop(Player player) {
        player.setState(StateEnum.STOP);
    }
}
