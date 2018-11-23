package pattern.structural.bridge;

/**
 * 定期账户
 *
 * @author 七夜雪
 * @create 2018-11-23 20:50
 */
public class FixedAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("这是一个定期账户...");
    }
}
