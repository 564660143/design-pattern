package pattern.structural.flyweight;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 14:07
 */
public class Client {
    private static final String departments[] = {"开发","测试","产品","人力"};

    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();

        }

    }
}
