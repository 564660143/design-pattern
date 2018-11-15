package creational.builder;

/**
 * builder模式中的Director
 * @author xuxiumeng
 * 2018/11/14 13:48
 */
public class Computer {

    private String cpu;
    private String memory;
    private String Mainboard;
    private String disk;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return Mainboard;
    }

    public void setMainboard(String mainboard) {
        Mainboard = mainboard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", Mainboard='" + Mainboard + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
