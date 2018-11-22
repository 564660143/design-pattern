package pattern.creational.builder;

/**
 * builder模式中的Director
 * @author 七夜雪
 * 2018/11/14 15:23
 */
public class Person {
    private ComputerBuilder builder;

    public Person(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer excuteBuilder(String cpu, String memory, String disk, String mainboard){
        builder.buildCpu(cpu);
        builder.buildMemory(memory);
        builder.buildDisk(disk);
        builder.buildMainboard(mainboard);
        return builder.build();
    }

}
