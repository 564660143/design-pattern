package principle.compositionaggregation;

/**
 * @author 七夜雪
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
