package pattern.creational.builder.v2;

/**
 * 电脑类,Builder模式中的Product
 *
 * @author 七夜雪
 * 2018/11/14 13:48
 */
public class Computer {

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.memory = computerBuilder.memory;
        this.mainboard = computerBuilder.mainboard;
        this.disk = computerBuilder.disk;
    }

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

    public static class ComputerBuilder {
        private String cpu;
        private String memory;
        private String mainboard;
        private String disk;

        public ComputerBuilder buildCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder buildMemory(String memory){
            this.memory = memory;
            return this;
        }

        public ComputerBuilder buildMainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder buildDisk(String disk){
            this.disk = disk;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
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
