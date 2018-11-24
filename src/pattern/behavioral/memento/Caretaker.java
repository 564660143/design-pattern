package pattern.behavioral.memento;

import java.util.Stack;

/**
 * 管理者/负责人
 *
 * @author 七夜雪
 * @create 2018-11-24 16:16
 */
public class Caretaker {
    public Stack<Memento> stack = new Stack<>();

    /**
     * 添加备份
     * @param memento
     */
    public void addMemento(Memento memento){
        stack.push(memento);
    }

    /**
     * 恢复备份
     * @param memento
     */
    public Memento undoMemento(){
        if (stack.empty()) {
            System.out.println("无备份");
            return null;
        }
        return stack.pop();
    }

}
