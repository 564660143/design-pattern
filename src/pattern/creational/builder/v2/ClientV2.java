package pattern.creational.builder.v2;

/**
 * Builder第二版测试类
 *
 * @author 七夜雪
 * @create 2018-11-22 17:17
 */
public class ClientV2 {

    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        Computer computer = builder.buildCPU("酷睿I9-9900K")
                .buildMemory("海盗船 DDR4 64G")
                .buildMainboard("华硕Z390")
                .buildDisk("金士顿 1T SSD").build();
        System.out.println(computer);
    }

}
