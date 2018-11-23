package pattern.structural.bridge;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 20:56
 */
public class Client {

    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount();
        Account fixedAccount = new FixedAccount();
        // 工商银行 + 定期
        Bank icbcBank1 = new ICBCBank(fixedAccount);
        // 工商银行 + 活期
        Bank icbcBank2 = new ICBCBank(currentAccount);

        // 农业银行 + 定期
        Bank abcBank1 = new ABCBank(fixedAccount);
        // 工商银行 + 活期
        Bank abcBank2 = new ABCBank(currentAccount);

        icbcBank1.openAccount();
        icbcBank2.openAccount();
        abcBank1.openAccount();
        abcBank2.openAccount();

    }

}
