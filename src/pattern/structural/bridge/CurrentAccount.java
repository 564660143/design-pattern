package pattern.structural.bridge;

/**
 * 活期账户
 *
 * @author 七夜雪
 * @create 2018-11-23 20:52
 */
public class CurrentAccount implements Account {
    @Override
    public void openAccount() {
        System.out.println("这是一个活期账户...");
    }
}
