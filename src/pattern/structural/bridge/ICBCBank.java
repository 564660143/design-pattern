package pattern.structural.bridge;

/**
 * 中国工商银行
 *
 * @author 七夜雪
 * @create 2018-11-23 20:53
 */
public class ICBCBank implements Bank {
    private Account account;

    public ICBCBank(Account account) {
        this.account = account;
    }

    @Override
    public void openAccount() {
        System.out.println("中国工商银行账户...");
        account.openAccount();
    }
}
