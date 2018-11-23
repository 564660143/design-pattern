package pattern.structural.facade;

/**
 * 外观类
 *
 * @author 七夜雪
 * @create 2018-11-23 14:00
 */
public class Facade {
    private SubTv subTv = new SubTv();
    private SubBox subBox = new SubBox();
    public void open(){
        subTv.openTv();
        subBox.openBox();
    }

}
