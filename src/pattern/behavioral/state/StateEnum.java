package pattern.behavioral.state;

/**
 * 枚举类
 *
 * @author 七夜雪
 * @create 2018-11-25 9:39
 */
public interface StateEnum {
    public final static State PLAY = new PlayState();
    public final static State PAUSE = new PauseState();
    public final static State SPEED = new SpeedState();
    public final static State STOP = new StopState();
}
