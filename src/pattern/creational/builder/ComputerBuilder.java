package pattern.creational.builder;

/**
 * builder模式中的builder
 * @author 七夜雪
 * 2018/11/14 13:51
 */
public class ComputerBuilder {

    private Computer computer  = new Computer() ;

    public Computer getComputer() {
        return this.computer;
    }

    public ComputerBuilder buildCpu(String cpu){
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder buildMemory(String memory){
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder buildMainboard(String mainboard){
        computer.setMainboard(mainboard);
        return this;
    }

    public ComputerBuilder buildDisk(String disk){
        computer.setDisk(disk);
        return this;
    }

}
