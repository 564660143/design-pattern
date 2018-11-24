package pattern.behavioral.memento;

/**
 * @author 七夜雪
 * @create 2018-11-24 16:11
 */
public class Originator {
    private String title;
    private String content;
    private final Caretaker caretaker = new Caretaker();

    public Originator(String title, String content) {
        caretaker.addMemento(new Memento(title, content));
        this.title = title;
        this.content = content;
    }

    /**
     * 修改文章
     * @param title
     * @param content
     */
    public void modify(String title, String content){
        this.title = title;
        this.content = content;
    }


    /**
     * 撤销修改
     */
    public void undo(){
        Memento bak = caretaker.undoMemento();
        if (bak == null) {
            return;
        }
        this.title = bak.getTitle();
        this.content = bak.getContent();
    }

    /**
     * 打印操作,辅助测试
     */
    public void print(){
        System.out.println("文章标题 : " + title);
        System.out.println("文章内容 : " + content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        caretaker.addMemento(new Memento(this.title, content));
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        caretaker.addMemento(new Memento(title, this.content));
        this.content = content;
    }
}
