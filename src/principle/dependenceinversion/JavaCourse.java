package principle.dependenceinversion;

/**
 * @author 七夜雪
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
