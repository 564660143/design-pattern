package pattern.creational.builder;

/**
 * builder模式中的builder
 * @author 七夜雪
 * 2018/11/14 13:51
 */
public class ComputerBuilder implements IComputerBuilder{
    private Computer computer  = new Computer();


    @Override
    public Computer build() {
        return this.computer;
    }

    @Override
    public void buildCpu(String cpu){
        computer.setCpu(cpu);
    }

    @Override
    public void buildMemory(String memory){
        computer.setMemory(memory);
    }

    @Override
    public void buildMainboard(String mainboard){
        computer.setMainboard(mainboard);
    }

    @Override
    public void buildDisk(String disk){
        computer.setDisk(disk);
    }

}
