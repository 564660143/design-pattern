package pattern.behavioral.state;

/**
 * 播放状态
 * ConcreteState subclasses(具体状态子类)
 *
 * @author 七夜雪
 * @create 2018-11-25 9:34
 */
public class PlayState implements State {

    @Override
    public void play(Player player) {
        System.out.println("视频播放中...");
    }

    @Override
    public void pause(Player player) {
        player.setState(StateEnum.PAUSE);
    }

    @Override
    public void speed(Player player) {
        player.setState(StateEnum.SPEED);
    }

    @Override
    public void stop(Player player) {
        player.setState(StateEnum.STOP);
    }
}
