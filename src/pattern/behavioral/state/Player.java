package pattern.behavioral.state;

/**
 * @author 七夜雪
 * @create 2018-11-25 9:33
 */
public class Player {
    private State state;

    public Player(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void speed() {
        state.speed(this);
    }

    public void stop() {
        state.stop(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
