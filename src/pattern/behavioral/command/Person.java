package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令模式中的Invoker
 *
 * @author 七夜雪
 * @create 2018-11-24 18:21
 */
public class Person {
    private static List<Command> commands = new ArrayList<>();

    private Person() {
    }

    public static void excute(){
        for (Command command : commands) {
            command.excute();
        }
        commands.clear();
    }

    public static void addCommand(Command command){
        commands.add(command);
    }

    public static void removeCommand(Command command){
        commands.remove(command);
    }

}
