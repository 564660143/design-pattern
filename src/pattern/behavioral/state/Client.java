package pattern.behavioral.state;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-25 10:07
 */
public class Client {

    public static void main(String[] args) {
        Player player = new Player(StateEnum.PLAY);
        System.out.println("Player状态 : " + player.getState().getClass().getSimpleName());
        player.pause();
        System.out.println("Player状态 : " + player.getState().getClass().getSimpleName());
        player.speed();
        System.out.println("Player状态 : " + player.getState().getClass().getSimpleName());
        player.stop();
        System.out.println("Player状态 : " + player.getState().getClass().getSimpleName());
        player.speed();
    }

}
