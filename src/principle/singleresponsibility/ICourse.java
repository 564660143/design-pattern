package principle.singleresponsibility;

/**
 * @author 七夜雪
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();

}
