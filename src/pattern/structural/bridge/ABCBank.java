package pattern.structural.bridge;

/**
 * 中国农业银行
 *
 * @author 七夜雪
 * @create 2018-11-23 20:52
 */
public class ABCBank implements Bank {
    private Account account;

    public ABCBank(Account account) {
        this.account = account;
    }

    @Override
    public void openAccount() {
        System.out.println("中国农业银行账户...");
        account.openAccount();
    }
}
