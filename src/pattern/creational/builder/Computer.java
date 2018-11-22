package pattern.creational.builder;

/**
 * 电脑类,Builder模式中的Product
 *
 * @author 七夜雪
 * 2018/11/14 13:48
 */
public class Computer {

    private String cpu;
    private String memory;
    private String mainboard;
    private String disk;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
