package pattern.structural.composite;

/**
 * 测试类
 *
 * @author 七夜雪
 * @create 2018-11-23 20:03
 */
public class Client {

    public static void main(String[] args) {
        FileComponent catlog = new Catalog("D:/", 1);
        FileComponent catlog1 = new Catalog("小说", 2);
        FileComponent catlog2 = new Catalog("电影", 2);
        catlog.addFile(catlog1);
        catlog.addFile(catlog2);
        FileComponent file1 = new File("傲慢与偏见", 150);
        FileComponent file2 = new File("基督山伯爵", 1024);
        catlog1.addFile(file1);
        catlog1.addFile(file2);
        FileComponent file3 = new File("复仇者联盟", 2048 * 1024);
        FileComponent file4 = new File("战狼", 1024 * 1024);
        catlog2.addFile(file3);
        catlog2.addFile(file4);
        catlog.print();
    }

}
