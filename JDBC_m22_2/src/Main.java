import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/testDB?user=postgres&password=0";
    private static String con_ok="Соединение с бд установлено";
    private static String con_err="Произошла ошибка подключения к бд";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL)){
            System.out.println(String.format("%s",con_ok));
        } catch (SQLException e) {
            System.out.println(String.format("%s",con_err));
            e.printStackTrace();
        }
    }
}