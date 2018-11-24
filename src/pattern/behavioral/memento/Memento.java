package pattern.behavioral.memento;

/**
 * 备忘录
 * 作为备忘录不能进行修改属性, 所以这里只暴露了Getter方法
 * @author 七夜雪
 * @create 2018-11-24 16:15
 */
public class Memento {
    private String title;
    private String content;

    public Memento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
