package principle.compositionaggregation;

/**
 * @author 七夜雪
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
