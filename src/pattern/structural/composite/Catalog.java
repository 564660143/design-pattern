package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录类, 对应模式中Composite
 *
 * @author 七夜雪
 * @create 2018-11-23 19:54
 */
public class Catalog extends FileComponent {
    private String name;
    private Integer level;
    private List<FileComponent> list = new ArrayList<>();

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addFile(FileComponent file) {
        list.add(file);
    }

    @Override
    public void removeFile(FileComponent file) {
        list.remove(file);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (FileComponent fileComponent : list) {
            String space = "";
            if (level != null) {
                for (Integer i = 0; i < level; i++) {
                    space += "  ";
                }
            }
            System.out.print(space);
            fileComponent.print();
        }
    }
}
