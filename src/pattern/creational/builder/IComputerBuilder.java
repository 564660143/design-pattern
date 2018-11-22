package pattern.creational.builder;

/**
 * Builder接口
 *
 * @author 七夜雪
 * @create 2018-11-22 16:53
 */
public interface IComputerBuilder {
    public void buildCpu(String cpu);
    public void buildMemory(String memory);
    public void buildMainboard(String mainboard);
    public void buildDisk(String disk);
    public Computer build();
}
