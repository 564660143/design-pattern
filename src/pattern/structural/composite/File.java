package pattern.structural.composite;

/**
 * 对应模式中Leaf角色
 *
 * @author 七夜雪
 * @create 2018-11-23 19:50
 */
public class File extends FileComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("文件名称 : " + this.name + "  文件大小 : " + this.size + "KB");
    }
}
