package pattern.behavioral.state;

/**
 * State(状态)
 *
 * @author 七夜雪
 * @create 2018-11-25 9:33
 */
public interface State {

    public void play(Player player);
    public void pause(Player player);
    public void speed(Player player);
    public void stop(Player player);


}
