package creational.builder;

/**
 * builder模式中的Director
 * @author xuxiumeng
 * 2018/11/14 15:23
 */
public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    public void excuteBuilder(){
        builder.buildCpu("Intel Core i7");
        builder.buildMemory("金士顿 DDR4 8 G");
        builder.buildDisk("金士顿 SSD 240G");
        builder.buildMainboard("华硕 X99");
    }


}
